class Outer{
	int a = 123;
	private String str = "geminno";
	
	void run(){
		String local_var="�ֲ�����";
		final int num = 1111;
		//�ֲ��ڲ���
		//public class Inner{   //error   �����÷������η�ȥ����
		//static class Inner{   //error
		class Inner{
			String str = "inner class";
			int aaa=888;
			//static String var = "static var";   //error  ���ܶ��徲̬����
			static final String s="java";
			
			void inner_run(){
				//System.out.println("�ڲ��ࣺ��Ա����"+local_var);  //���ܷ��ʾֲ�����local_var
			System.out.println("�ڲ��ࣺ��Ա����"+num);    //���Է��ʳ���
			System.out.println(a+"\t"+str);   //==this.str
			System.out.println(Outer.this.str);    //�ⲿ��  ��Ա����
			}
		}
			Inner in = new Inner();
			in.inner_run();
	}
}

public class LocalInner{
	public static void main(String[] args){
			Outer out = new Outer();
			out.run();
	}
}