package hellogem;

import java.util.Scanner;

public class Hellogem {
	public static void main(String[] args) {
		System.out.println("请输入课程代号(1至3之间的数字)");
		Scanner in=new Scanner(System.in);
		int courseCode = in.nextInt();
		switch (courseCode) {
		case 1:
			System.out.println("C#编程");
			break;
		case 2:
			System.out.println("Java编程");
			break;
		case 3:
			System.out.println("SQL编程");
			break;

		}
				
	}

}
