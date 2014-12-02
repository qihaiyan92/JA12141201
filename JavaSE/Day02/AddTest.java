public class AddTest{
       public static void main(String args[]){
	      int a=0;
		  System.out.println(++a);   //先运算再取值
		  System.out.println(a++);    //先取值在运算
		  int b=4;
		  System.out.println(++b);
		  System.out.println(b++);
		  
		  int score=80;
		  int x=-100;
		  String type = score<60?"不及格":"及格";
		  int flag =x>0?1:(x==0?0:-1);
		  System.out.println("type="+type);
		  System.out.println("flag="+flag);
	   }


}