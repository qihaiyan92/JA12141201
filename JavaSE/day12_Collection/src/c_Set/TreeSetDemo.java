package c_Set;

import java.util.Iterator;
import java.util.TreeSet;
//class Errs{}


import bean.ComparatorByLength;

/*
 * TreeSet:Ҫ�����Ԫ�ر�����пɱ��ԡ��������ʵ��comparable��
 * Ԫ�رȽϱ�׼��comparableTo()==0
 * */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorByLength());
		//TreeSet ts = new TreeSet();
		// �Զ�����
//		ts.add(3);
//		ts.add(23);
//		ts.add(-12);
//		ts.add(0);
//		ts.add(35);
//		ts.add(10);
		
		
		
		ts.add("abc");
		ts.add("nba");
		ts.add("cba");
		ts.add("cuba");
		ts.add("apple");
		ts.add("zxa");
		ts.add("hello");
		
		//��TreeSet��ӵ�Ԫ��Ӧ����ͬһ�����ͣ�
		//ts.add(123);
		for (Iterator it = ts.iterator(); it.hasNext();) {
			String object = (String) it.next();
			System.out.println(object);
		}
		
		System.out.println("-------------------------");
		System.out.println(ts.first());   //��ӡ��һ��Ԫ��
		System.out.println(ts.last());
		
//		TreeSet ts2 = new TreeSet();
//		ts2.add(new Errs());
//		ts2.add(new Errs());   //c_Set.Errs cannot be cast to java.lang.Comparable
//		ts2.add(new Errs());   /������ӵ�Ԫ��û�пɱ��ԣ���������Ĵ���
	}

}
