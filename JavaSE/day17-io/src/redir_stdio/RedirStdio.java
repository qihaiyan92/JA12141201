package redir_stdio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/*
 * System.in     键盘           setIn(InputStream)
 * System.out    屏幕	setOut(PrintStream)
 * System.err    屏幕           setErr(PrintStream)
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
//			System.out.println("重定向之前：打印到终端");
//			System.out.println(new Object());
//			//System.out--->ps
//			//System.setOut(ps);
//			
////			System.out.println("重定向之后：打印到文件");
////			System.out.println(new Object());
//			
//			System.out.println("覆盖");
//		} catch (FileNotFoundException e) {
//			fj
//			e.printStackTrace();
//		}finally{
//			ps.close();
//		}
		try {
			FileInputStream fis = new FileInputStream("redir.txt");
			Scanner sc= new Scanner(System.in);
			System.out.println("请输入名字：");
			String str = sc.next();
			System.out.println("重定向之前：从终端读取="+str);
			System.setIn(fis);
			
			//使用System.in对象构建Scanner对象，来获取输入
			Scanner scanner = new Scanner(System.in);
			scanner.useDelimiter("\n");
			while (scanner.hasNext()) {
				System.out.println("文件输入内容："+scanner.next());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
