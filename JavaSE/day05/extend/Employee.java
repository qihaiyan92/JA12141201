public class Employee{
    int ID;
	String name;
	double salary;
	
	//隐藏的无参构造函数
	
	//构造函数：不能被继承
	public Employee(){
	     System.out.println("父类无参构造函数");
	
	} 
	public Employee(int ID){
	     this.ID=ID;
	System.out.println("父类一参构造函数");
	} 
	
	public String getName(){
	   return name;
	}
	public double getSalary(){
	   return salary;
	}
	public void info(){
	  System.out.println("子类的info()");
	  System.out.println("ID:"+ID+"\nname:"+name+"\nsalary:"+salary);
	  
	}
	
	
	
}