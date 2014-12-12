package gem.javase;

class Person{
	String name;
	int age;
	
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age=age;
	}
	public String toString(){
		return "name:"+name+"\t age:"+age;
		//return "��д��object��toString����";
	}

	//ͬһ����� ���ԣ�
	public boolean equals(Object obj){
		//�Ƿ�ָ��ͬһ�����
		if(this==obj){
			return true;
		}
		//�Ƿ���ͬһ�����
		boolean res = obj instanceof Person;
		
		if(res){//ͬ��
			Person obj1 = (Person)obj;
			if(this.name == obj1.name && this.age == obj1.age){//���ԣ�
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}

public class Test{
	public static void main(String[] args){
		Test test=new Test();
		System.out.println(test.getClass());
		//ֱ�Ӵ�ӡ����ʱ����Ĭ�ϵ���toString����
		System.out.println(test);
		System.out.println(test.toString());
		
		Person p = new Person("geminno", 12);
		Person p1 = new Person("google", 13);
		//System.out.println(p);
		p.equals(p1);
		Person p2=p1;
		System.out.println("equals():"+p.equals(p1)+"\t==" +( p==p1));
		System.out.println("equals():"+p2.equals(p1)+"\t==" + (p2==p1));
	}
}