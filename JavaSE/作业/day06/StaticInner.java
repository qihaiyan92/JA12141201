class Outer{
    //成员变量
	static int a=123;
	static private String str= "外部类的变量";
	
	//静态成员内部类
	static class Inner{
		String str = "gem";
		void run(){
			System.out.println("内部类非静态变量");
			System.out.println(a);
			System.out.println(str);
		}
		static String static_str = "内部类静态变量";
		static void static_run(){
			System.out.println("内部类静态方法");
		}
	}
	
	void run(){
		//对内部类的类变量、类方法
		System.out.println(Inner.static_str);
		Inner.static_run();
		
		//对内部类的实例变量、实例方法
		Inner in = new Inner();
		System.out.println(in.str);
		in.run();
	}
}

public class StaticInner{
	public static void main(String[] args){
		System.out.println(Outer.Inner.static_str);
		Outer.Inner.static_run();
		
		Outer.Inner in = new Outer.Inner();
		System.out.println(in.str);
		in.run();
		in.static_run(); 
	}
}