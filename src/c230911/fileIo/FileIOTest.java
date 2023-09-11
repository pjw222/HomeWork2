 package c230911.fileIo;

import java.io.Writer;
import java.io.Reader;
import java.io.FileWriter;
import java.io.FileReader;

public class FileIOTest {
	
	public static void test()
	{
		String path = "C:/Users/KGA/git/HomeWork2/src/c230911/byteStream/test.text";
		// Window 기준 //writer 를 쓰면 outputstream 을 불러서 쓴다
		System.out.println();
		
		try 
		{
			Writer writer = new FileWriter(path);
			
			
			writer.write('a');
			writer.write('b');
			writer.write('c');
			writer.write('d');
			writer.write("이것은\t");
			writer.write("테스트\t");
			writer.write("입니다");
			
			
		    writer.flush();
			writer.close();
			
			Reader reader = new FileReader(path);
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
//			System.out.println((char)reader.read());
//			System.out.println(reader.read());
			
			char[] arr = new char [10];
			int count = reader.read(arr);
			System.out.println(count + " : " + new String(arr, 0, count));
			for(int i = 0; i < count; i++)
			{
				System.out.println("arr [" + i + "] : " + arr[i]);
			}

			reader.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
