class Outer{
    //成员变量
	int a=123;
	private String str= "外部类的变量";
	
	//成员内部类
	class Inner{
	    //static int a;     //error  内部类中不能定义静态变量
		String str = "内部类的变量";
		void run(){
			String str = "局部变量";
			System.out.println("内部类run()");
			//System.out.println(a+"\t"+str);
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);  //类名Outer只能访问静态变量，str不是静态变量
		}
		
	}
	//成员方法
	void run(){
		System.out.println("外部类run()");
		Inner in = new Inner();
		in.run();
	}
	static void static_run(){
	   System.out.println("外部类static_run()");
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
}

public class InnerDemo{
	public static void main(String[] args){
		//外部类的使用
		Outer outer = new Outer();
		//outer.run();
		outer.static_run();
		
		 
		//内部类的使用
		/* Outer out = new Outer();
		Outer.Inner in = out.new.Inter();
		in.run(); */
		
		//简写方式如下：
		//Outer.Inner inner = new Outer().new Inner();    //匿名对象的语法
		//功能与上一条语句一样
		//Outer.Inner inner = (new Outer()).new Inner();
		
		//inner.run(); 
	}
}