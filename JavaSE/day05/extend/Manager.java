public class Manager extends Employee{
    //��������
     String car;
	 String office;
	 
	 //���๹�췽����������ø��๹�췽��
	 //�����޲ι��췽��+û����ʾ���ø��๹�췽��=�Զ����ø�����޲ι��졾ϵͳ �Զ��塿
	 public Manager(){  
	     //super();
	     System.out.println("�����޲ι��캯��");
	 }
	 
	 //����һ�ι��췽��
	public Manager(int ID){ 
	    super(ID);    //����Ĺ��캯��
	    System.out.println("����һ�ι��캯��");
	    //this.ID=ID;
		
	}
	
	//�������ι��췽��
	public Manager(int ID,String name){
	  //this��super����ͬʱ����
	    this(ID);     //this ----��ָ����------->һ�ι��캯��
	    System.out.println("�������ι��캯��");
	    //this.ID=ID;
		
		this.name=name;
		
	}
	  
	 
	 //���з���
	 public void drive(){
	   // System.out.println("name:"+name+"��"+car+"�ϰ�");
		System.out.println("super.name:"+super.name+"��"+this.car+"�ϰ�");   //this��ʡ��
	    System.out.println("this.name:"+this.name+"��"+this.car+"�ϰ�");
	 }
	 
	 
    //surer:���������
	public void info(){
	  System.out.println("�����info()");
	  //System.out.println("ID:"+ID+"\nname:"+name+"\nsalary:"+salary);
	  super.info();
	  System.out.println("car:"+car+"\noffice:"+office);
	
	
	}
	

}