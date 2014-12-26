package b_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i < 5; i++) {
			al.add("it-"+i);      //自动装箱       将基本数据类型   封装成   对象
		}
		
		//遍历
		for (Object object  : al) {
			System.out.println(object);
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		for (Iterator it = al.iterator(); it.hasNext();) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
		Iterator it = al.iterator();
	     while(it.hasNext()){
	    	 Object object=(Object) it.next();
		     System.out.println(object);
	     }
	}

}
