class Outer{
	int a = 123;
	private String str = "geminno";
	
	void run(){
		String local_var="局部变量";
		final int num = 1111;
		//局部内部类
		//public class Inner{   //error   不能用访问修饰符去修饰
		//static class Inner{   //error
		class Inner{
			String str = "inner class";
			int aaa=888;
			//static String var = "static var";   //error  不能定义静态变量
			static final String s="java";
			
			void inner_run(){
				//System.out.println("内部类：成员方法"+local_var);  //不能访问局部变量local_var
			System.out.println("内部类：成员方法"+num);    //可以访问常量
			System.out.println(a+"\t"+str);   //==this.str
			System.out.println(Outer.this.str);    //外部类  成员变量
			}
		}
			Inner in = new Inner();
			in.inner_run();
	}
}

public class LocalInner{
	public static void main(String[] args){
			Outer out = new Outer();
			out.run();
	}
}