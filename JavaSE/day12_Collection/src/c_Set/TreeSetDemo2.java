package c_Set;

import java.util.Iterator;
import java.util.TreeSet;

import bean.Person;
/*
 * ʹ����Ȼ����
 * ����ͨ����пɱ��ԣ�ʵ��comparable�ӿڣ���дcompareTo�������Զ���ȽϹ���==���ϵ��������
 */
public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(); 
		
		ts.add(new Person(12,"google"));
		ts.add(new Person(1,"geminno"));
		ts.add(new Person(6,"baidu"));
		ts.add(new Person(8,"alibaba"));
		ts.add(new Person(6,"abcd"));
		
		ts.add(new Person(6,"oracle"));
		ts.add(new Person(3,"oracle"));
		ts.add(new Person(10,"oracle"));
		ts.add(new Person(5,"oracle"));
		ts.add(new Person(2,"oracle"));
		
		for (Iterator it = ts.iterator(); it.hasNext();) {
			Person object = (Person) it.next();
			System.out.println(object);
		}
		
//		System.out.println(ts.first());
//		System.out.println(ts.last());
	}

}
