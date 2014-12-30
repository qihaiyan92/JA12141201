package node_stream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * �ڵ�������ײ��豸�ļ��������ͼ���
 * �����������ڽڵ������߼���
 * */
public class StringNode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ʹ���ڴ��е��ַ�����Ϊ����Դ
		String src = "aaaaaaaaaaaaaaaaaaaaaa"+
					 "bbbbbbbbbbbbbbbbbbbbbb"+
					 "cccccccccccccccccccccc"+
					 "dddddddddddddddddddddd";
		
		char[] buffer =new char[32];
		int hasRead = 0;
		StringReader sr =new StringReader(src);
		try {
			while ((hasRead=sr.read(buffer)) > 0) {
				System.out.println(new String(buffer,0,hasRead));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		StringWriter sw = new StringWriter();
		sw.write("eeeeeeeeeeeeeeeeeeeeee");
		sw.write("ffffffffffffffffffffff");
		sw.write("ggggggggggggggggggggggg");
		sw.write("zzzzzzzzzzzzzzzzzzzzzzz");
		
		System.out.println(sw.toString());
	
	
	}

}
