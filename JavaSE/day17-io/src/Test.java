import java.io.FileWriter;
import java.io.IOException;


/*
 * 文件中对异常的处理
 * */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//字符输出流
		FileWriter fw = null;
		try {
			fw = new FileWriter("baidu.txt");
			fw.write("百度杀毒");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{  //关闭系统资源
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
	}

}
