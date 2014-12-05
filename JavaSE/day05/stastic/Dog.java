//Dog  抽象的狗

//Dog 某种品种的狗

public class Dog{
     //属性
	 //品种
	 static String type;//类变量==类属性==静态成员变量（用static修饰）：不依赖于对象【类名.类变量】    
	 
	 int age;      //实例变量（没有用static修饰）：依赖于对象【对象引用.实例变量】  
	 String color;
	 
	 //静态代码块
	 static{  //使命：初始化 类变量
	      //this.type="xxxxxx";  //error：无法从静态上下文中引用【非静态变量this】
	 	  type="xxxxxx"; 
		  System.out.println("我是在static代码块中");
		  
         
		 /* age=321;        //!实例变量
		  color="yyy";*/
	 }
	 
	 
	 
	 //方法
	 Dog(){}
	 Dog(int age,String color){
	     this.type="哈士奇";
	     this.age=age;
		 this.color=color;
	 
	 
	 }
	 //实例方法:tjis代表调用的引用
      void bark(){
	     this.type="泰迪";
	     System.out.println("barking........");
	  
	  }	
    
    //类方法:不能访问【实例变量】==不依赖对象，==this
	//abstract（抽象）   //不能与static(具体)同时存在
    static void bark1(){   //没有对象，所以不能访问实例对象、实例变量
	    //只能访问类变量、局部变量
		type="京巴";
		System.out.println("类方法");
	       //this.age=11;   //error 不能在static中访问不是static的对象
		   //this.color="green";
	
	}	
	 

}