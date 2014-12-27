package priority;

public class JoinDemo extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName()+"����");
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main:"+i);
			if (i==38) {
				JoinDemo jd = new JoinDemo();
				jd.start();
				//��main�̵߳�����jd��join������main�̵߳ȴ�jd�̵߳Ľ������ż���ִ��
				//���統ǰ�̣߳���������һ���̵߳�join�������ý��̻�ȴ���
				jd.join();
			}
		}
		System.out.println(Thread.currentThread().getName()+"����");
	}

}
