//��Ա������ʼ��������====���캯��
//������ܲ����ڹ��캯���г�ʼ����

public class DogTest{
    public static void main(String[] args){
	   //�����:�������ڶ��������ڶ��������
	    System.out.println("Dog.type=" + Dog.type);
	    Dog.type="����";
	    System.out.println("Dog.type=" + Dog.type);
		System.out.println("������static�������");
		//�෽��
		Dog.bark1();
		
		//Dog.age=123;  //error
		//Dog.bark();
	/*	
		Dog dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15,"black");
		
		//�����
		System.out.println("dog.type=" + dog.type);
		System.out.println("dog2.type="+dog2.type);
	    System.out.println("Dog.type=" + Dog.type);
		
		
		//ʵ������:�����ڶ���
		System.out.println("dog.age="+dog.age);
		System.out.println("dog2.age="+dog2.age);
		
		// Dog.age=123;    //error:��������ֱ��ȥ������������ 
	*/	
	
	    Dog dog = new Dog(12,"Red");
		Dog dog2 = new Dog(15,"black");
		
		dog.bark();  //this==dog
		dog2.bark();  //this==dogs
		
		
	    //ʹ�ö�������  ����  �෽��
	      dog.bark();
	      dog.bark1();
	  
	}

}