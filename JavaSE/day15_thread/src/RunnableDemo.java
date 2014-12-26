/*
 * 1、实现了【线程任务run】和线程对象
 * 2、RunnableDemo extends A【避免单继承限制】
 * */
public class RunnableDemo implements Runnable {
	private int i;
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() +i);
		}

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		RunnableDemo rd = new RunnableDemo();
		RunnableDemo rd1 = new RunnableDemo();
//		Thread th = new Thread(rd);
		Thread th1 = new Thread(rd1);
		//Thread th1 = new Thread(rd);
		for (int i = 55; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"=="+i);
			if (i==55) {
				new Thread(rd).start();
				th1.start();
			}
			
		}
				
//		rd.run();
//		rd1.run();

	}

}
