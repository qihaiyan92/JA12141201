package char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * File����
 * ������ �����ļ�����
 * �ַ���������-->������--->�ļ�
 * */
public class FileWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");
		
		//д�뻺����    ��windows��ת���ǣ�\r\n
		//fw.write("������ �����ļ�����   \r\n google android");
		//�ļ��Ѿ����ڣ�write׷��     Ч����google androidGmail
		//fw.write("Gmail");		
		fw.write("GFW:������");    //���뻺����    //����ļ��Ѿ����ڣ��Ḳ�� 
		
		//ˢ��
		//fw.flush();
		//�ر�֮ǰ����ˢ�£�����fw.flush()�Ͳ���Ҫ�ˣ��ر�֮��Ͳ����ٲ�����
		fw.close();
		
		FileWriter fw2 = new FileWriter("file_append.txt", true);
		fw2.write("google");
		fw2.write("gmail");
		fw2.write("\r\nGFW:������");
		fw2.close();
	}

}
