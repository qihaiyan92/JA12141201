//Dog  ����Ĺ�

//Dog ĳ��Ʒ�ֵĹ�

public class Dog{
     //����
	 //Ʒ��
	 static String type;//�����==������==��̬��Ա��������static���Σ����������ڶ�������.�������    
	 
	 int age;      //ʵ��������û����static���Σ��������ڶ��󡾶�������.ʵ��������  
	 String color;
	 
	 //��̬�����
	 static{  //ʹ������ʼ�� �����
	      //this.type="xxxxxx";  //error���޷��Ӿ�̬�����������á��Ǿ�̬����this��
	 	  type="xxxxxx"; 
		  System.out.println("������static�������");
		  
         
		 /* age=321;        //!ʵ������
		  color="yyy";*/
	 }
	 
	 
	 
	 //����
	 Dog(){}
	 Dog(int age,String color){
	     this.type="��ʿ��";
	     this.age=age;
		 this.color=color;
	 
	 
	 }
	 //ʵ������:tjis������õ�����
      void bark(){
	     this.type="̩��";
	     System.out.println("barking........");
	  
	  }	
    
    //�෽��:���ܷ��ʡ�ʵ��������==����������==this
	//abstract������   //������static(����)ͬʱ����
    static void bark1(){   //û�ж������Բ��ܷ���ʵ������ʵ������
	    //ֻ�ܷ�����������ֲ�����
		type="����";
		System.out.println("�෽��");
	       //this.age=11;   //error ������static�з��ʲ���static�Ķ���
		   //this.color="green";
	
	}	
	 

}