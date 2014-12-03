public class ForTest{
      public static void main(String args[]){
	      long result=0;
		  long f=1;
		  //循环的初始条件，循环条件，循环迭代语句都在下面一行
		  for(int i=1;i<=10;i++){
		    f *= i;
			result +=f;
		  }
		  System.out.println("result="+result);
	  }
 
 
 
 }