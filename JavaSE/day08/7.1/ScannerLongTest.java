import java.util.*;
public class ScannerLongTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//�ж��Ƿ�����һ��long����
		while(sc.hasNextLong()){
			System.out.println("��������������ǣ�"+sc.nextLong());
		}
	}
}