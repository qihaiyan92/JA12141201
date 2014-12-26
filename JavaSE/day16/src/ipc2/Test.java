package ipc2;

import ipc2.Input;
import ipc2.Output;
import ipc2.Resource;
/*
 * 多线程：线程任务系统的
 * 线程任务不相同的多线程：
 * 
 * 1、怎么去获得共享数据？-------一参构造器
 * 2、怎么保证input、output线程同步？
 * 3、产量 ==销量？
 * */

class Resource{
	int id;
	String name;
	boolean flag = false;   //是否有产品
}

/*产线:产品是否卖出去了？  再去确定是否开工继续生产？
 * 	有：1、通知销售   2、不生产
 * 	无：1、被告知       2、生产
 * */

class Input implements Runnable{
	Resource r;
	//构造器：对成员变量 r进行初始化
	public Input(Resource r) {
		super();
		this.r = r;
	}
	int key = 0;
	@Override
	public void run() {		
		while (true) {
			synchronized (r) {	
				
				//1、产品是否存在
				if (r.flag) {  //停产、休息：线程释放CPU
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}								
				} 
				
				//2、继续生产
				switch (key++%3) {
				case 0:
					r.id = 6666;
					r.name = "iphone6"; 
					System.out.println("生产iphone6");
					break;
				case 1:
					r.id = 7777;
					r.name = "iphone7";
					System.out.println("生产iphone7");
					break;
				case 2:
					r.id = 8888;
					r.name = "iphone8"; 
					System.out.println("生产iphone8");
					break;

				default:
					break;
				}	
				
				//3、有产品，通知销售
				r.flag = true;
				r.notify();
			}			
		}
	}
}

/*
 * 销售：是否有产品可买？
 * 有：1、被产线告知      2、销售
 * 无：1、通知产线      2、休息：停止销售
 * */
class Output implements Runnable{
	Resource r;
	//构造器：对成员变量 r进行初始化
	public Output(Resource r) {
		super();
		this.r = r;
	}
	@Override
	public void run() {		
		while (true) {
			synchronized (r) {
				
				//1、有无产品
				if (!r.flag) {   //没产品
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
				}
				
				//2、销售
				System.out.println("卖：name:"+r.name +"\t id:"+r.id);
				
				//3、卖完了
				r.flag = false;
				r.notify();     //通知
			}			
		}
	}	
}
public class Test {
	public static void main(String[] args) {
		//1、创建共享资源
		Resource r = new Resource();
		
		//2、创建线程任务：run
		Input input = new Input(r);
		Output output = new Output(r);
		
		//3、创建线程对象：
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);
		
		//4、开启
		th_in.start();
		th_out.start();

	}

}

