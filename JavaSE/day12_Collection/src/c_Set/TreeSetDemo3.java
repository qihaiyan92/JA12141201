package c_Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import bean.ComparatorByAge;

import bean.Person;

/*
 * 使用比较器排序
 * */
public class TreeSetDemo3 {

	public static void main(String[] args) {
		//使用treeset比较器，先年龄，后名字
		TreeSet ts = new TreeSet(new ComparatorByAge());
		//默认使用person的自然排序
		//TreeSet ts = new TreeSet(); 
		
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

	}

}
