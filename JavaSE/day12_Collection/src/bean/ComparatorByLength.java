package bean;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 按String的长度排序
 * */
public class ComparatorByLength implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String length1 = (String)o1;
		String length2 = (String)o2;
		
		return length1.compareTo(length2);


	}

}
