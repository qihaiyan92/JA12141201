import java.util.*;
public class ScannerLongTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//判断是否还有下一个long整数
		while(sc.hasNextLong()){
			System.out.println("键盘输入的内容是："+sc.nextLong());
		}
	}
}