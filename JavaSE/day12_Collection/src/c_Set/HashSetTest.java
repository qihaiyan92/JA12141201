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
		 * ��дequals����������true������£�����hashcode��һ��
		 * ��ˣ�hashSet��Ȼ������������
		 */
		System.out.println(hs.add(new A()));
		System.out.println(""+hs.add(new A())+hs.size());
		/*
		 * ���������hashcode��ͬ�����ǣ�equals��������false��
		 * ��ˣ�hashset���������ͬ��Ԫ��
		 * 
		 */
		
		System.out.println(hs.add(new B()));
		System.out.println(""+hs.add(new B())+hs.size());
		/*
		 * ��equals����true��hashcode������ͬ��ֵ��
		 * hashset������Ϊ��ͬһ��Ԫ��
		 * 
		 */
	
		System.out.println(hs.add(new C()));
		System.out.println(""+hs.add(new C())+hs.size());
  }
}

