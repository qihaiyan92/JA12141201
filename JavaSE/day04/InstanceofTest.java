public class InstanceofTest{
     public static void main(String[] args){
	     Person p =  new Person("android",12);
	     String str = new String("Hello");
		 
		 if(str instanceof Object){
		    System.out.println("str ��Object��");
		 }else{
		    System.out.println("str ��Object��");
		 }
		/* 
		 if(str instanceof person){
		    System.out.println("str ������");
		 }else{
		    System.out.println("str ������");
		 }
		 */
	 }
}