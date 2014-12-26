import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * collections:�Ǽ��Ͽ�ܵĹ����࣬�������Ǿ�̬����=�෽��
 * Tree set\map:����Ȼ���򡢼��ϱȽ������ڲ���ʱ�����������
 * List:Ĭ�ϲ�������
 * */
public class CollectionsDemo {

	public static void main(String[] args) {
		run1();
		//run2();
	}
	
	//String����
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
			
			//ʹ��Ԫ�ص���Ȼ˳������
			Collections.sort(list);
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------"); 
			
			//ʹ�ñȽ��������򣺵�������ͬʱ����������Ⱥ�˳������
			Collections.sort(list,new ComByLength());
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//��������
			Comparator<String> comparator= Collections.reverseOrder(new ComByLength());
			Collections.sort(list, comparator);
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//ͷβԪ�ػ���
			Collections.swap(list, 0, list.size()-1);
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//Ԫ��ȫ�����"google"
			Collections.replaceAll(list, "baidu", "google");
//			Collections.fill(list, "google");
			for (String string : list) {
				System.out.println(string);
			}
			System.out.println("--------------------------");
			
			//Ĭ�Ϸ�ת
//			Collections.reverse(list);
//			for (String string : list) {
//				System.out.println(string);
//			}
//			System.out.println("--------------------------");
			
			//ʵ�ֶ���Ȼ���������			
//			Comparator<String> com = Collections.reverseOrder();
//			Collections.sort(list, com);
//			for (String string : list) {
//				System.out.println(string);
//			}
//			System.out.println("--------------------------");
			
//			String max = Collections.max(list);
//			String min = Collections.min(list);
//			System.out.println("��Ȼ����max:"+max+"\tmin:"+min);
//			String max1 = Collections.max(list, new ComByLength());
//			String min1 = Collections.min(list, new ComByLength());
//			System.out.println("ʹ�ñȽ�����max:"+max1+"\tmin:"+min1);
			
	   }
		
	   //person����
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
		
		//��Ȼ����
		Collections.sort(list2);
		for (Person person : list2) {
			System.out.println(person);
		}
		//�Ƚ�������
		Collections.sort(list2, new ComByAge());
		for (Person person : list2) {
			System.out.println(person);
		}
		
		Person max = Collections.max(list2, new ComByAge());
		Person min = Collections.min(list2, new ComByAge());
		System.out.println("max:"+max+"min:"+min);
		
	}
	
}
