public class Employee{
    int ID;
	String name;
	double salary;
	
	//���ص��޲ι��캯��
	
	//���캯�������ܱ��̳�
	public Employee(){
	     System.out.println("�����޲ι��캯��");
	
	} 
	public Employee(int ID){
	     this.ID=ID;
	System.out.println("����һ�ι��캯��");
	} 
	
	public String getName(){
	   return name;
	}
	public double getSalary(){
	   return salary;
	}
	public void info(){
	  System.out.println("�����info()");
	  System.out.println("ID:"+ID+"\nname:"+name+"\nsalary:"+salary);
	  
	}
	
	
	
}