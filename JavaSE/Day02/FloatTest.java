public class FloatTest{
      public static void main(String args[]){
	   //整型默认转换成浮点型
	    float floatNum = 123;
		System.out.println("floatNum="+floatNum);
		//浮点类型常量默认为：double类型
		//float floatNum1 = 3.14;    //error
		float floatNum1 = 3.14f;     //f或F
		float floatNum2 = 3.14e2f;
		
		double sum = floatNum + floatNum1 + 321 + 3.14;
		//float sum = (float)floatNum + floatNum1 + 321 + 3.14;
		System.out.println ('a');
		System.out.println ('a'+1);
		System.out.println ('a'+(byte)1);
		
		byte b=3;
		b=(byte)(b+4);
		//b=b+(byte)4;     //error 不能强制转换int类型的4
		
		byte b1=3,b2=4,b3;
		//b3=b1+b2;        //error   
		b3=(byte)(b1+b2);
		b3=3+4;
		}

}