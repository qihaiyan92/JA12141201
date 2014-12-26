import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

/*
 * 容器:数组---->集合
 * asList:使数组可以使用集合的高级的方法，不需要手动实现。但是，不支持增删操作，因为数组固定长度
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
		//判断数组中是否有某个元素？
		//System.out.println("baidu是否存在："+isExist(str, "baidu"));
		
//		List<String> list = Arrays.asList(str);
//		System.out.println("jack是否存在："+isExist(str, "jack"));
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
