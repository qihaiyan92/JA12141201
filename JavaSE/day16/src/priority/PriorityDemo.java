package priority;

class Demo extends Thread{
	String name;
	
	public Demo(String name) {
		super();
		this.name = name;
		this.setName(name);
	}
	
	public void run(){
		super.run();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+"\t pri="+getPriority());
	}
	
}
public class PriorityDemo {

	public static void main(String[] args) {
		Demo demo1 = new Demo("线程1");
		Demo demo2 = new Demo("线程2");
		Demo demo3 = new Demo("线程3");
		
		demo1.setPriority(Demo.MAX_PRIORITY);
		demo2.setPriority(8);
		demo3.setPriority(Demo.MAX_PRIORITY);
		
		demo1.start();
		demo2.start();
		demo3.start();
	}

	
}
