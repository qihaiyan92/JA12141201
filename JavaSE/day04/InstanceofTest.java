public class InstanceofTest{
     public static void main(String[] args){
	     Person p =  new Person("android",12);
	     String str = new String("Hello");
		 
		 if(p instanceof Person){
		    System.out.println("str 是人类");
		 }else{
		    System.out.println("str 非人类");
		 }
	 }
}