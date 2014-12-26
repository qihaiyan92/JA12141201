package c_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Set接口:无序、元素不能重复
		Set set =new HashSet();
		
		set.add("abc");
		set.add("cba");
		set.add("bac");
		set.add("a");
		set.add("b");
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		System.out.println(set.add("cba"));    //cba已存在,返回false
		System.out.println(set);
	}

}
