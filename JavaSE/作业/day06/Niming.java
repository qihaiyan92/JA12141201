//������
abstract class USB{
	public abstract void read();
	public abstract void write();
}
//�ӿ�
interface Wifi{
	public abstract void open();
	public abstract void close();
}

public class Niming{
	public static void main(String[] args){
	//�����ڲ���==����ľֲ��ڲ���==����Ķ������ʵ����Ķ���     ��Ӿֲ��ڲ��������
		USB udisk = new USB(){
			int a;
			//static int b;    //error  ���ܶ��徲̬
			final static int b=123;
			public void read(){
				System.out.println("��ȡU��");
			}
			public void write(){
				System.out.println("дU��");
			}
		};
		udisk.read();
		udisk.write();
		
		//wifi
		Wifi wifi = new Wifi(){
			public void open(){
				System.out.println("��wifi");
			}
			public void close(){
				System.out.println("�ر�wifi");
			}
		};
		wifi.open();
		wifi.close();
		
	}

}