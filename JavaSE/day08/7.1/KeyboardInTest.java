import java.util.*;
import java.io.*;
public class KeyboardInTest{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine()) !=null){
			System.out.println("用户键盘输入是："+line);
		}
	}
}
