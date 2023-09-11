package c230911.dataStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {
	public static void test() {
		try {
			String path = DataStreamTest.class.getResource("").getPath()+"text.db";
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
//			oos.writeObject(class);
			Student s1 = new Student(1, "권AA", 90.0);
			Student s2 = new Student(2, "임AA", 93.0);
			Student s3 = new Student(3, "김AA", 100.0);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			
			oos.flush();
			oos.close();
			fos.close();
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
//			Student[] arr = new Student[5];
		
			
			Student sr1 =(Student) ois.readObject();
			System.out.println(sr1.num);    //클래스한테 시리얼번호 적어줘야댄다
			System.out.println(sr1.name);
			System.out.println(sr1.score);
			
			sr1 =(Student) ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);
			
			sr1 =(Student) ois.readObject();
			System.out.println(sr1.num);
			System.out.println(sr1.name);
			System.out.println(sr1.score);			
			

			ois.close();
			fis.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
