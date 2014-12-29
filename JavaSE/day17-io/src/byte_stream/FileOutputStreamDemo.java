package byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		//1������File���󡢴���������
		FileInputStream fis =new FileInputStream("./src/byte_stream/FileOutputStreamDemo.java");
		FileOutputStream fos = new FileOutputStream("out.txt");
		
		//2��IO��д
		byte[] bbuf = new byte[1024];
		int size = 0;
		while ((size=fis.read(bbuf)) != -1) {
			fos.write(bbuf);   //ֱ��д���ļ���
			System.out.println(new String(bbuf, 0, size));
			
		}
	}

}
