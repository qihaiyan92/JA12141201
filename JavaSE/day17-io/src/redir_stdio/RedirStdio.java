package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/*
 * System.in     ����           setIn(InputStream)
 * System.out    ��Ļ	setOut(PrintStream)
 * System.err    ��Ļ           setErr(PrintStream)
 * */
public class RedirStdio {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		PrintStream ps = null;
//		try {
//			ps = new PrintStream(new FileOutputStream("redir.txt"));
//						
//			System.out.println("�ض���֮ǰ����ӡ���ն�");
//			System.out.println(new Object());
//			//System.out--->ps
//			//System.setOut(ps);
//			
////			System.out.println("�ض���֮�󣺴�ӡ���ļ�");
////			System.out.println(new Object());
//			
//			System.out.println("����");
//		} catch (FileNotFoundException e) {
//			fj
//			e.printStackTrace();
//		}finally{
//			ps.close();
//		}
		try {
			FileInputStream fis = new FileInputStream("redir.txt");
			Scanner sc= new Scanner(System.in);
			System.out.println("���������֣�");
			String str = sc.next();
			System.out.println("�ض���֮ǰ�����ն˶�ȡ="+str);
			System.setIn(fis);
			
			//ʹ��System.in���󹹽�Scanner��������ȡ����
			Scanner scanner = new Scanner(System.in);
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				System.out.println("�ļ��������ݣ�"+scanner.next());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
