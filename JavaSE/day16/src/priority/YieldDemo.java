package priority;

public class YieldDemo extends Thread{
	
	public YieldDemo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+"=="+i);
			//当i=55的时候，让当前线程给其他线程让步，自己进入线程池
			if (i==25) {
				//this.yield();
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		YieldDemo yd1= new YieldDemo("线程一");
		YieldDemo yd2 = new YieldDemo("线程二");
		
		yd1.setPriority(MAX_PRIORITY);
		yd1.start();
		yd2 .start();

	}

}
