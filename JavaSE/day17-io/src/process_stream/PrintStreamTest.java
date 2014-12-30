package process_stream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;




/*
 * �������������˵ײ������豸�Ͻڵ����Ĳ��졢���ṩ���ӷ���������������
 * ���裺
 * 		1���ṩһ���ڵ���
 * 		2����װ�ɴ�����
 * 		3��ֱ��ʹ�ô�������IO��������ӵĲ����ײ���豸�ļ�
 * 		4���ر���Դ
 * 
 * ʹ��PrintStream��װOutputStream:�ֽ���=�ڵ���
 * */
public class PrintStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		FileOutputStream fos=null;
		PrintStream ps = null;
		try {
			//1�������ڵ���
			 fos = new FileOutputStream("process_stream.txt");
			//2����װ�ɴ�����
			 ps = new PrintStream(fos);
			//3��IO
			ps.println("������");			
			ps.println(new PrintStreamTest());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			fos.close();
			ps.close();
		}

	}

}
