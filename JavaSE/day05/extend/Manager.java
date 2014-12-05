public class Manager extends Employee{
    //特有属性
     String car;
	 String office;
	 
	 //子类构造方法：必须调用父类构造方法
	 //子类无参构造方法+没有显示调用父类构造方法=自动调用父类的无参构造【系统 自定义】
	 public Manager(){  
	     //super();
	     System.out.println("子类无参构造函数");
	 }
	 
	 //子类一参构造方法
	public Manager(int ID){ 
	    super(ID);    //父类的构造函数
	    System.out.println("子类一参构造函数");
	    //this.ID=ID;
		
	}
	
	//子类两参构造方法
	public Manager(int ID,String name){
	  //this、super不能同时出现
	    this(ID);     //this ----（指代）------->一参构造函数
	    System.out.println("子类两参构造函数");
	    //this.ID=ID;
		
		this.name=name;
		
	}
	  
	 
	 //特有方法
	 public void drive(){
	   // System.out.println("name:"+name+"开"+car+"上班");
		System.out.println("super.name:"+super.name+"开"+this.car+"上班");   //this可省略
	    System.out.println("this.name:"+this.name+"开"+this.car+"上班");
	 }
	 
	 
    //surer:父类的引用
	public void info(){
	  System.out.println("子类的info()");
	  //System.out.println("ID:"+ID+"\nname:"+name+"\nsalary:"+salary);
	  super.info();
	  System.out.println("car:"+car+"\noffice:"+office);
	
	
	}
	

}