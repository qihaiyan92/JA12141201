class Outer{
    //��Ա����
	int a=123;
	private String str= "�ⲿ��ı���";
	
	//��Ա�ڲ���
	class Inner{
	    //static int a;     //error  �ڲ����в��ܶ��徲̬����
		String str = "�ڲ���ı���";
		void run(){
			String str = "�ֲ�����";
			System.out.println("�ڲ���run()");
			//System.out.println(a+"\t"+str);
			System.out.println(a);
			System.out.println(str);
			System.out.println(this.str);
			System.out.println(Outer.this.str);  //����Outerֻ�ܷ��ʾ�̬������str���Ǿ�̬����
		}
		
	}
	//��Ա����
	void run(){
		System.out.println("�ⲿ��run()");
		Inner in = new Inner();
		in.run();
	}
	static void static_run(){
	   System.out.println("�ⲿ��static_run()");
		Outer.Inner in = new Outer().new Inner();
		in.run();
	}
}

public class InnerDemo{
	public static void main(String[] args){
		//�ⲿ���ʹ��
		Outer outer = new Outer();
		//outer.run();
		outer.static_run();
		
		 
		//�ڲ����ʹ��
		/* Outer out = new Outer();
		Outer.Inner in = out.new.Inter();
		in.run(); */
		
		//��д��ʽ���£�
		//Outer.Inner inner = new Outer().new Inner();    //����������﷨
		//��������һ�����һ��
		//Outer.Inner inner = (new Outer()).new Inner();
		
		//inner.run(); 
	}
}