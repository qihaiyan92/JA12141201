
public class One implements Runnable{
	static int ticket = 10;  //����ʮ��Ʊ����
	static int num = 0;    //��ǰ������Ʊ��
	public void run(){
		for (int i = 0; i <= 10; i++) {
			if (ticket > 0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName() + "�����˵�"+num +"�ų�Ʊ����ʣ"+ticket+"�ų�Ʊ");
			}
		}
		
	}
	public static void main(String[] args) {
		One t = new One(); 
		Thread O1 =new Thread(t);
		Thread O2 =new Thread(t);
		Thread O3 =new Thread(t);
		O1.setName("��һ����Ʊ����");
		O2.setName("�ڶ�����Ʊ����");
		O3.setName("��������Ʊ����");
		O1.start();
		O2.start();
		O3.start();

	}

}
