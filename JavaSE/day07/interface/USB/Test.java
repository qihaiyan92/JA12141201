public class Test{
	public static void main(String[] args){
	//�̳е�����ת�� VS �ӿڡ�ʵ���������ת��
	
		USB T1 = new USB_KEY();
		//System.out.println(T1.brand);   //error  brandclass USB�е�����
		T1.read();
		T1.write();
		
		Udisk T2 = new Udisk();
		T2.read();
		T2.write();
	
	}
}