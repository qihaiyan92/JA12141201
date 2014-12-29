package byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//1、创建文件对象：水库
		File file = new File("./src/byte_stream/FileInputStreamDemo.java");
		//2、创建流对象：管道
		FileInputStream fis = new FileInputStream(file);
		

		
		//3、IO操作：读
		//滴
//		int ch = 0;
//		while ((ch=fis.read()) != -1){
//			System.out.println((char)ch);
//		}
		
		//瓢
		byte[] bbuf = new byte[32];  //1024b = 1k
		int size = 0;
		size = fis.read(bbuf);
		System.out.println(new String(bbuf, 4, size-4));
		
		while ((fis.read(bbuf)) != -1) {
			//字节数组---->字符串
			System.out.print(new String(bbuf, 0, size));
		}
		
		//4、关闭
		fis.close();
	}

}
