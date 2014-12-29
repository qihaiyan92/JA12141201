package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//文件输入流:文件必须存在，否则：异常
		FileReader fr =new FileReader("new.txt");
		FileWriter fw=new FileWriter("jack.txt");
		//单个字符输出到终端
//		int ch = 0;
//		while ((ch=fr.read()) != -1){
//			System.out.println((char)ch);    //打印到终端
//			fw.write(ch);
//		}	
//		fr.close();
//		fw.close();
		
		//单个字符输出到终端和gem.txt文件中
		char[] ch = new char[1024];  
		int size = 0;
		while ((size=fr.read(ch)) != -1) {
			//数组---->字符串
			System.out.println(new String(ch, 0, size));
			fw.write(ch, 0, size);
		}
		fw.close();
		fr.close();
		
		
	}

}
