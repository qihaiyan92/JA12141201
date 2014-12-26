package d_Map;

import java.util.HashMap;
import java.util.Iterator;

import bean.Person;

public class HashMapDemo {

	public static void main(String[] args) {
		//Person��City
		HashMap<Person, String> hm = new HashMap<>();
		
		//HashSet  Ԫ���Ƿ���ͬ�����ݣ�hashCode  equals
		//HashMap  Ԫ���Ƿ���ͬ�����ݣ����Ƿ���ͬ
		hm.put(new Person(100, "IBM"), "USA");
		hm.put(new Person(15, "alibaba"), "HangZhou");
		hm.put(new Person(123, "google"), "Sfancisose");
		hm.put(new Person(12, "baidu"), "BeiJing");
		hm.put(new Person(12, "baidu"), "SuZhou");  //
		
		//����
		Iterator<Person> it = hm.keySet().iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			System.out.println("Age:"+person.getAge()+"\tName:"+person.getName()
					+"\tCity:"+hm.get(person));
		}
		
		
	}

}
