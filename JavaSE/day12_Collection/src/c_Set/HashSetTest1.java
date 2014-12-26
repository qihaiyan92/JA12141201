package c_Set;

import java.util.HashSet;
import java.util.Iterator;

import bean.Person;

public class HashSetTest1 {

	/*
	 * 把自定义对象添加到hashset
	 */
	public static void main(String[] args) {
		HashSet  hs = new HashSet();
		
		Person person = new Person(111,"IBM");
		hs.add(person);

		hs.add(new Person(12,"google"));
		hs.add(new Person(23,"apple"));
		System.out.println(hs.add(new Person(12,"google")));
		System.out.println(hs.add(new Person(12,"baidu")));
		//System.out.println(""+hs+"size="+hs.size());
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Person object = (Person) it.next();
			System.out.println(object.getName()+"-"+object);
		}
	}

}
