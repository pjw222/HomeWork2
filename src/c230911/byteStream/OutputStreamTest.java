package c230911.byteStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;


public class OutputStreamTest {
	// 통신이란 뭘까?
	//   - 데이터를 주고 받는 것
	//   - 언제 통신한다고 얘기할 수 있을까? 
	//     => 데이터를 보내고 답신을 받을 때? -> 어디로? 서버? 클라이언트? DB?
	//     => 위 내용은 일반적으로 생각할 수 있는 통신이다.
	//     => 키보드 입력 시 데이터가 메인보드를 통해 CPU에 전달된다. (즉 우리가 데이터를 다루는 것 하나 하나가 통신이다.)
	//     => 통신을 시작했으면 끝을 적어줘야 한다.
	public static void test() {
		// "C:\Users\KGA\git\HomeWork2\src\c230911\byteStream"
		String path = "C:/Users/KGA/git/HomeWork2/src/c230911/byteStream/test.db";
		// Window 외 나머지 (Linux, Unix, Mac, Ubuntu, Android, ...)
		
		System.out.println();
		try {
			
			OutputStream os = new FileOutputStream(path);
			
			os.write(10);
			os.write(20);
			os.write(30);
			os.write(40);
			
			os.flush();  //비우다 메모리에 담아둔걸 비우다 메모리가 가득차지 않았어도 강제로 파일로 저장한다. HDD와 통신한다. //버퍼는 1바이트
			os.close();
			
			InputStream is = new FileInputStream(path);
		
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read());
//			System.out.println(is.read()); //-1 끝났다 라는 표시
			
			while(true) {
				int data = is.read();
				if(data == -1)break;
				System.out.println("data : "+ data);
			}
			is.close(); // 통신을 끝내라
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			OutputStream os = new FileOutputStream(path);
			
			byte[] arr = {10, 20, 30};
			os.write(arr);
			
			os.flush();
			os.close();
			
			InputStream is = new FileInputStream(path);
			byte[] arr1 = new byte[100]; //최대 몇 바이트까지 가져올지 배열로 생성한다.
			int count = is.read(arr1);
			for(int i = 0; i < count; i++)
			{
				System.out.println("arr1 [" + i + "] : " + arr1[i]);
			}
			System.out.println(count);
			// "가" << UTF - 8 << 3byte << FF FF FF => AC 00
			
			
			is.close();
		}
		catch(Exception e)
		{
			
		}
	}
}
