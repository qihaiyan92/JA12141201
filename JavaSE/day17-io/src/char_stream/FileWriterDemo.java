package char_stream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * File对象：
 * 流对象： 操作文件内容
 * 字符流：程序-->缓冲区--->文件
 * */
public class FileWriterDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("new.txt");
		
		//写入缓冲区    在windows中转行是：\r\n
		//fw.write("流对象： 操作文件内容   \r\n google android");
		//文件已经存在：write追加     效果：google androidGmail
		//fw.write("Gmail");		
		fw.write("GFW:公愤网");    //放入缓冲区    //如果文件已经存在，会覆盖 
		
		//刷新
		//fw.flush();
		//关闭之前会先刷新，所以fw.flush()就不需要了；关闭之后就不能再操作了
		fw.close();
		
		FileWriter fw2 = new FileWriter("file_append.txt", true);
		fw2.write("google");
		fw2.write("gmail");
		fw2.write("\r\nGFW:公愤网");
		fw2.close();
	}

}
