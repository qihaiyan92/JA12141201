//����Person��
public class PersonTest{
     public static void main(String[] args){
	     //ʵ����:����=����=ʵ��
		 // �ڶ������ʱ��û�С��Զ����޲ι��캯��������ϵͳ�Զ�ָ��������
         // �ڶ������ʱ��  �С��Զ����޲ι��캯����ʹ���Զ���Ĺ�����
	     Person geminno = new Person(); 
		 Person gem = new Person("�߲�"); 
		 Person gemptc = new Person("�߲�����",12); 
		 
		 
		 //����ʹ�ã�����.��Ա����    ����.��Ա����
		// System.out.println("Name:"+geminno.name+"Age:"+geminno.age);
		 geminno.info();
		 gem.info();
		 gemptc.info();

	 }//end main 
}//end class