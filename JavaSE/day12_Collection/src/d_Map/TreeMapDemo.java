package d_Map;

import java.util.Iterator;
import java.util.TreeMap;

import bean.Person;

public class TreeMapDemo {

	public static void main(String[] args) {
		//PersonºÍCity
		TreeMap<Person, String> tm = new TreeMap<>();
				
		tm.put(new Person(100, "IBM"), "USA");
		tm.put(new Person(15, "alibaba"), "HangZhou");
		tm.put(new Person(123, "google"), "Sfancisose");
		tm.put(new Person(12, "baidu"), "BeiJing");
		tm.put(new Person(12, "baidu"), "SuZhou"); 
					
		//±éÀú
		Iterator<Person> it = tm.keySet().iterator();
		while (it.hasNext()) {
			Person person = (Person) it.next();
			System.out.println(person);
		}
		
		
		}
	}


