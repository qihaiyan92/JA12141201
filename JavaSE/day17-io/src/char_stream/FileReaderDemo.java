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
		//�ļ�������:�ļ�������ڣ������쳣
		FileReader fr =new FileReader("new.txt");
		FileWriter fw=new FileWriter("jack.txt");
		//�����ַ�������ն�
//		int ch = 0;
//		while ((ch=fr.read()) != -1){
//			System.out.println((char)ch);    //��ӡ���ն�
//			fw.write(ch);
//		}	
//		fr.close();
//		fw.close();
		
		//�����ַ�������ն˺�gem.txt�ļ���
		char[] ch = new char[1024];  
		int size = 0;
		while ((size=fr.read(ch)) != -1) {
			//����---->�ַ���
			System.out.println(new String(ch, 0, size));
			fw.write(ch, 0, size);
		}
		fw.close();
		fr.close();
		
		
	}

}
