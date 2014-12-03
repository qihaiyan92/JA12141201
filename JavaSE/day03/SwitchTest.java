import java.util.Scanner;
public class SwitchTest{
        public static void main(String args[]){
		    System.out.println("输入喜欢的汽车");
			Scanner in =new Scanner(System.in);
			String car = in.next();   //读取的单词,其他的读取方法还有：nextInt()  next Line();
			switch(car){
			    case"Benz":
				    System.out.println("Benz");
				     break;
                case"Tesla":
				    System.out.println("Tesla");
				     break;
				case"Ford":
				    System.out.println("Ford");
				     break;	
                default:
				  System.out.println("others car");
				     break;
			
			}
			in.close();
		}
 }