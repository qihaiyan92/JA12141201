public class IntTest{
     public static void main(String args[]){
	     //小整型常量默认自动转换int类型  
	    int num = 88;
		//大整型常量不会自动转换long类型 
		//long long1 =88888888888888;
		long long1 =88888888888888L;//建议是大写L
		long long2 =88888888888888l;
	   //八进制表示整型： 以0开头
	   int var = 013;
	    System.out.println("var:" +var );
	   //16进制表示整型：以0X开头，以0x开头
	   int hexNum = 0xFF;
	   int hexNum1 = 0X1F;
	    System.out.println("hexNum:" +hexNum + "\n hexNum1" + hexNum1 );
	   //2进制表示整型：以0B开头，以0b开头 
	   byte byteNum = (byte)0b11111111;    //error
	   int intNum = 0b11111111;  
	   System.out.println("intNum:" +intNum+"\n byteNum" + byteNum);
	   
	 }
}