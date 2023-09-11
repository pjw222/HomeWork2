package c230911;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void test()
	{
		// String path 
		Path path = Paths.get("src/c230911/../c230908"); //경로에 대해서 여러기지를 다룰수있다.
		System.out.println(path.toAbsolutePath().normalize());  //윈도우나 맥이랑 패스가 다른데 이건 자동으로 맞춰준다.
		//normalize 경로에대해서 최종적으로 조정해준다.

		File file = new File(path.toString() + "\\Main1.java");
		System.out.println(file.exists()); //c230908에 Main1.java가 있느냐?
		try {
	//		file.createNewFile();  // 파일만들기
			file.mkdir();  // 저장공간만들기
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
