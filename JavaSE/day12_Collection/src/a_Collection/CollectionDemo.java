package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();  //Ĭ������ת��
		Collection co= new ArrayList();
		
		//String-----Person
		//1����Ӳ���
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		coll.add("Xiaomi");
		
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("Xiaomi");
		
		System.out.println("����"+co);
		System.out.println("����"+coll);
		
		co.addAll(coll);
		System.out.println("����"+co);
		System.out.println("����"+coll);
		
		//2��ɾ��
//		System.out.println(coll.remove("Xiaomi"));
//     	System.out.println(coll.remove("Apple"));
//		System.out.println("����"+coll);
		
		//ɾ������====coll��co���е�Ԫ��
		//coll.removeAll(co);
		//coll.clear();
		//System.out.println("����"+coll);
		
		//ȡ����
//		coll.retainAll(co);
//		System.out.println("����"+coll);
		
		
		//3���жϲ���
//		System.out.println("coll.isEmpty="+coll.isEmpty());
//		System.out.println("co.isEmpty="+co.isEmpty());
//      System.out.println("co.contains=Google=?"+co.contains("Google"));
		
		//�Ӽ��ж�
		System.out.println(coll.containsAll(co));
		coll.add("Geminno");
		System.out.println(""+co.containsAll(coll)+"\t"+co.size());
		
		//��������  
		//Iterator����������������Ԫ�أ���������
		Iterator it = co.iterator();
		
		while (it.hasNext()) {
			String str = (String) it.next();
			//co.add("geminno");
			//co.remove("Baidu");
			System.out.println(str);		
				}
		
		System.out.println("==========================");
		
		for (Iterator it1 = coll.iterator(); it1.hasNext();) {
			String str = (String) it1.next();
					System.out.println(str);	
				}
		
		System.out.println("==========================");
		
		//foreach���
		for (Object object : coll) {
			String str = (String)object;
			//coll.add("tes");
			//coll.remove("Xiaomi");
			System.out.println("coll:"+str);	
		}
		
		
//		System.out.println(""+it.next()+co.size());
//		it.remove();
//		System.out.println(""+co+co.size());
		
		
		
		
	}

}
