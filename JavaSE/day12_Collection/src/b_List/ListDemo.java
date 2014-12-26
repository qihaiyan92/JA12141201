package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class A{
	
	public boolean equals(Object obj){
		return true;
		
	}
}
public class ListDemo {

	public static void main(String[] args) {
	    /*
	     * List:存储各种数据、元素可以重复、有序【可以使用访问元素】
	     * 相对Collection:特有方法：带索引index的方法
	     * */
		List list = new ArrayList();
		
		//1、增加操作
		list.add("Android-001");
		list.add("Android-002");
		list.add("Android-003");
		list.add("Android-004");
		list.add("Android-005");
		
		list.add(3, "Google");
		
		
//		for(int i=0; i< list.size();i++){
//			System.out.print(list.get(i));
//			
//		}
		
		//list中   使用equals方法判断  与元素是否相同
		System.out.println(list);
		System.out.println("Android-002:"+list.indexOf(new String("Android-002")));
		
		list.remove(new A());
		
		System.out.print("================");
		
		//2、删除操作
//		try{
//			System.out.println(list.remove(10));
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		System.out.println(list.remove("Android-003"));
		
		
		//3、修改
		//System.out.println(list.set(10, "GDG"));
			
//		System.out.print("================");
//		for(int i=0; i< list.size();i++){
//			System.out.println(list.get(i));
			
		//4、遍历
//	    for(Iterator it = list.iterator(); it.hasNext();){
//	    	Object object=(Object) it.next();
//	    	System.out.println(object);
//	    	
//	    }
//	     Iterator it = list.iterator();
//	     while(it.hasNext()){
//	    	 Object object=(Object) it.next();
//	    	 //list.add("test");
//		     System.out.println(object);
//	     }
	     
	     
	     System.out.print("=======ListIterator=========");
	     // ListIterator
//	     ListIterator iit =list.listIterator();
//	     iit.next();
//	     iit.previous();
//	     iit.set("geminno");
	    // while (iit.hasNext()) {
			//Object object = (Object) iit.next();
			//iit.add("Alibaba");    //ok
			//System.out.println(object);
	    	 //}
	     
//	     while (iit.hasPrevious()) {
//	    	 System.out.println(iit.previous());
//			
//		}
	    // System.out.println(list);

		}

	}


