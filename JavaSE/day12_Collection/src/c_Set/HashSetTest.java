package c_Set;

import java.util.HashSet;

class A{
	public int hashCode(){
		return 1;
	}
}

class B{
	public int hashCode(){
		return 1;
	}
}

class C{
	public int hashCode(){
		return 2;
	}
	public boolean equals(Object obj){
		return true;
	}
 }


   public class HashSetTest{
	   
	   public static void name(String[] args) {
		   
		HashSet hs= new HashSet();
		
		/*
		 * 复写equals方法，返回true的情况下，由于hashcode不一样
		 * 因此：hashSet依然当做两个对象
		 */
		System.out.println(hs.add(new A()));
		System.out.println(""+hs.add(new A())+hs.size());
		/*
		 * 两个对象的hashcode相同，但是，equals方法返回false：
		 * 因此：hashset添加两个不同的元素
		 * 
		 */
		
		System.out.println(hs.add(new B()));
		System.out.println(""+hs.add(new B())+hs.size());
		/*
		 * 当equals返回true、hashcode返回相同的值：
		 * hashset集合认为是同一个元素
		 * 
		 */
	
		System.out.println(hs.add(new C()));
		System.out.println(""+hs.add(new C())+hs.size());
  }
}

