package c230911.stream;

import c230911.PathTest;
import c230911.buffered.BufferedTest;
import c230911.byteStream.OutputStreamTest;
import c230911.dataStream.DataStreamTest;
import c230911.dataStream.ObjectStreamTest;
import c230911.fileIo.FileIOTest;
import c230911.fileIo.SubTest;

public class Main {
	public static void main(String[] args) {
		MacthTest test = new MacthTest();
		OptionTest test1 = new OptionTest();
		test.test();
		System.out.println();
		test1.test();
		System.out.println();
		OutputStreamTest.test();
		System.out.println();
		FileIOTest.test();
		System.out.println();
		SubTest.test();
		System.out.println();
		BufferedTest.test();
		System.out.println();
		DataStreamTest.test();
		ObjectStreamTest.test();
		PathTest.test();
	}
}
