//成员变量初始化工作？====构造函数
//类变量能不能在构造函数中初始化？

public class DogTest{
    public static void main(String[] args){
	   //类变量:不依赖于对象，优先于对象而存在
	    System.out.println("Dog.type=" + Dog.type);
	    Dog.type="藏獒";
	    System.out.println("Dog.type=" + Dog.type);
		System.out.println("我是在static代码块中");
		//类方法
		Dog.bark1();
		
		//Dog.age=123;  //error
		//Dog.bark();
	/*	
		Dog dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15,"black");
		
		//类变量
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type="+dog2.type);
	    System.out.println("Dog.type=" + Dog.type);
		
		
		//实例变量:依赖于对象
		System.out.println("dog.age="+dog.age);
		System.out.println("dog2.age="+dog2.age);
		
		// Dog.age=123;    //error:类名不能直接去访问类名变量 
	*/	
	
	    Dog dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15,"black");
		
		dog.bark();  //this==dog
		dog2.bark();  //this==dogs
		
		
	    //使用对象引用  访问  类方法
	      dog.bark();
	      dog.bark1();
	  
	}

}