public class Sub extends Base{
	String str="sub class";   //������������
	void sub_show(){
		System.out.println("sub�����еķ���");
	}
	void show(){
		System.out.println("���ิд�˸���ķ���sub class");
	
	}
	public static void main(String[] args){
	
	//����ת�ͣ�Ĭ�ϻ�������  ָ��  �������
	//���ܷ����������������ԣ����Է��ʻ����������ԡ������า�Ƿ���
	   Base base=new Sub();
	   
	   
	   //һ����������ò����Է������������
	  /*  System.out.println(base.str);
	   base.sub_show; */
	   
	   System.out.println(base.a);
	   base.base_show();
	   
	   //System.out.println(base.a);
	   base.show();
	   
	   /* //����ת�ͣ����������  ָ��  ����Ķ���
	   Sub sub = (Sub)new Base();
	   
	   //���ʸ��������
	   System.out.println(sub.a);
	   sub.base_show();
	   
	   //���ิд����ķ���
	   sub.show();
	   
	   //������������� */
	} 


}