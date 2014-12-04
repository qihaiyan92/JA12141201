import java.util.*;
public class BTest{
     public static void main(String args[]){
         Scanner in = new Scanner(System.in);
		 System.out.println("yourSales:");
		 double yourSales=in.nextDouble();
		System.out.println("target:");
		double target=in.nextDouble(); 
	    //int yourSales=12;
        //int target=5;
        String	performance = "";
        double bonus;		
	    if(yourSales>=target){
		  performance = "Staisfactory";
		  bonus=100+0.01*(yourSales-target);
		}else{
		   performance = "Unsatisfactory";
		   bonus = 0;
		}
	 System.out.println("performance="+performance+"\n"+"bonus=" + bonus);
	 }

}