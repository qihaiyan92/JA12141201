//同一个文件中只能有一个public修饰

public abstract class AbsDemo{
    //抽象类组成
	
	//构造方法：在子类的构造方法中，不能与new关键字结合
	
	public abstract void run();
	public static void main(String[] args){
		//抽象类：不能直接实例化对象
		//AbsDeno abs =new AbsDemo();   //error
		
		
	}
}