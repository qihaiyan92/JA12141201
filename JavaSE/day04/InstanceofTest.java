public class InstanceofTest{
     public static void main(String[] args){
	     Person p =  new Person("android",12);
	     String str = new String("Hello");
		 
		 if(str instanceof Object){
		    System.out.println("str 是Object类");
		 }else{
		    System.out.println("str 非Object类");
		 }
		/* 
		 if(str instanceof person){
		    System.out.println("str 是人类");
		 }else{
		    System.out.println("str 非人类");
		 }
		 */
	 }
}