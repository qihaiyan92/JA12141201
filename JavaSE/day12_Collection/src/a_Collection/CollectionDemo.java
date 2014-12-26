package a_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		
		Collection coll = new ArrayList();  //默认向上转型
		Collection co= new ArrayList();
		
		//String-----Person
		//1、添加操作
		coll.add("Google");
		coll.add("Apple");
		coll.add("Oracle");
		coll.add("Xiaomi");
		
		co.add("Baidu");
		co.add("Alibaba");
		co.add("Tencent");
		co.add("Xiaomi");
		
		System.out.println("国内"+co);
		System.out.println("国外"+coll);
		
		co.addAll(coll);
		System.out.println("国内"+co);
		System.out.println("国外"+coll);
		
		//2、删除
//		System.out.println(coll.remove("Xiaomi"));
//     	System.out.println(coll.remove("Apple"));
//		System.out.println("国外"+coll);
		
		//删除交集====coll与co共有的元素
		//coll.removeAll(co);
		//coll.clear();
		//System.out.println("国外"+coll);
		
		//取交集
//		coll.retainAll(co);
//		System.out.println("国外"+coll);
		
		
		//3、判断操作
//		System.out.println("coll.isEmpty="+coll.isEmpty());
//		System.out.println("co.isEmpty="+co.isEmpty());
//      System.out.println("co.contains=Google=?"+co.contains("Google"));
		
		//子集判断
		System.out.println(coll.containsAll(co));
		coll.add("Geminno");
		System.out.println(""+co.containsAll(coll)+"\t"+co.size());
		
		//遍历操作  
		//Iterator（迭代器）：查找元素，不能排序
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
		
		//foreach最简单
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
