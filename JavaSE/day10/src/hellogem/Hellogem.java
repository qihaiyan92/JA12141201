package hellogem;

import java.util.Scanner;

public class Hellogem {
	public static void main(String[] args) {
		System.out.println("������γ̴���(1��3֮�������)");
		Scanner in=new Scanner(System.in);
		int courseCode = in.nextInt();
		switch (courseCode) {
		case 1:
			System.out.println("C#���");
			break;
		case 2:
			System.out.println("Java���");
			break;
		case 3:
			System.out.println("SQL���");
			break;

		}
				
	}

}
