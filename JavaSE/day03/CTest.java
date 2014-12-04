import java.util.*;
public class CTest{
    public static void main(String args[]){
	     Scanner in = new Scanner(System.in);
		 System.out.println("How much money will you contribute every year?");
		 double payment=in.nextDouble();
		System.out.println("Interest rate in %:");
		 double interestRate=in.nextDouble(); 
	    int year=0;;
	    double balance=0;
		String input;
	   do{
	    balance+=payment;
		double interest=balance*interestRate/100;
		balance+=interest;
		year++;
		System.out.println("After year %d,your balance is %,.2f%n",year,balance);
		System.out.println("Ready to retire?(Y/N)");
		input=in.next();
	   }while(input.equals('N'));
	   //System.out.println(year+"year.");
	}
   
}