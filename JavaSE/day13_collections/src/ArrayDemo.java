import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

/*
 * ����:����---->����
 * asList:ʹ�������ʹ�ü��ϵĸ߼��ķ���������Ҫ�ֶ�ʵ�֡����ǣ���֧����ɾ��������Ϊ����̶�����
 * */
public class ArrayDemo {
	public static void main(String[] args) {
		run1();
	}
	public static void run1(){
		String[] str = {"baidu","google","alibaba"};
		System.out.println(str);
		System.out.println(Arrays.toString(str));
		for (String string : str) {
			System.out.println(string);
		}
		//�ж��������Ƿ���ĳ��Ԫ�أ�
		//System.out.println("baidu�Ƿ���ڣ�"+isExist(str, "baidu"));
		
//		List<String> list = Arrays.asList(str);
//		System.out.println("jack�Ƿ���ڣ�"+isExist(str, "jack"));
	}
	
	public static boolean isExist(String[] arr,String str){
		for (String e : arr) {
			if (e.equals(str)) {
				return true;
			}
		}
		return false;
	}
}
