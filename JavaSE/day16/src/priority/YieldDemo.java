package priority;

public class YieldDemo extends Thread{
	
	public YieldDemo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+"=="+i);
			//��i=55��ʱ���õ�ǰ�̸߳������߳��ò����Լ������̳߳�
			if (i==25) {
				//this.yield();
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		YieldDemo yd1= new YieldDemo("�߳�һ");
		YieldDemo yd2 = new YieldDemo("�̶߳�");
		
		yd1.setPriority(MAX_PRIORITY);
		yd1.start();
		yd2 .start();

	}

}
