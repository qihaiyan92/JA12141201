import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * collections:是集合框架的工具类，方法都是静态方法=类方法
 * Tree set\map:有自然排序、集合比较器，在插入时可以完成排序
 * List:默认不能排序
 * */
public class CollectionsDemo {

	public static void main(String[] args) {
		run1();
		//run2();
	}
	
	//String测试
	   public static void run1(){
		   List<String> list = new ArrayList<>();
			list.add("java");
			list.add("oracle");
			list.add("baidu");
			list.add("abcd");		
			list.add("google");
			list.add("facebook");
			list.add("b");
			list.add("bc");
			
			for (String string : list) {
				System.out.println(string);
			}
			
			System.out.println("--------------------------");
			
			//使用元素的自然顺序排序
			Collections.sort(list);
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------"); 
			
			//使用比较器的排序：当长度相同时，按加入的先后顺序排序
			Collections.sort(list,new ComByLength());
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//长度逆序
			Comparator<String> comparator= Collections.reverseOrder(new ComByLength());
			Collections.sort(list, comparator);
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//头尾元素互换
			Collections.swap(list, 0, list.size()-1);
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//元素全都变成"google"
			Collections.replaceAll(list, "baidu", "google");
//			Collections.fill(list, "google");
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//默认反转
//			Collections.reverse(list);
//			for (String string : list) {
//				System.out.println(string);
//			}
//			System.out.println("--------------------------");
			
			//实现对自然排序的逆序			
//			Comparator<String> com = Collections.reverseOrder();
//			Collections.sort(list, com);
//			for (String string : list) {
//				System.out.println(string);
//			}
//			System.out.println("--------------------------");
			
//			String max = Collections.max(list);
//			String min = Collections.min(list);
//			System.out.println("自然排序：max:"+max+"\tmin:"+min);
//			String max1 = Collections.max(list, new ComByLength());
//			String min1 = Collections.min(list, new ComByLength());
//			System.out.println("使用比较器：max:"+max1+"\tmin:"+min1);
			
	   }
		
	   //person测试
	   public static void run2(){	
		List<Person> list2 = new ArrayList<>();
		list2.add(new Person(12,"android"));
		list2.add(new Person(1,"java"));
		list2.add(new Person(23,"baidu"));
		list2.add(new Person(100,"IBM"));
		list2.add(new Person(88,"IBM"));
		list2.add(new Person(99,"IBM"));
		for (Person person : list2) {
			System.out.println(person);
		}
		
		System.out.println("--------------------------");
		
		//自然排序
		Collections.sort(list2);
		for (Person person : list2) {
			System.out.println(person);
		}
		//比较器排序
		Collections.sort(list2, new ComByAge());
		for (Person person : list2) {
			System.out.println(person);
		}
		
		Person max = Collections.max(list2, new ComByAge());
		Person min = Collections.min(list2, new ComByAge());
		System.out.println("max:"+max+"min:"+min);
		
	}
	
}
