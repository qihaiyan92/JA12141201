package ipc3;

import ipc3.Input;
import ipc3.Output;
import ipc3.Resource;
/*
 * 多线程：线程任务系统的
 * 线程任务不相同的多线程：
 *	1、怎么去获得共享数据？-------一参构造器
 * 	2、怎么保证input、output线程同步？
 * 	3、产量 ==销量？
 * 线程通信： 等待---唤醒
 * 		wait：释放锁、释放CPU、进入线程池
 * 		notify： 通过指定的监视器（锁）唤醒、
 * 		notifyAll
 * 使用同一个锁来调用方法 ==
 * 					  任意
 * 		共享数据———————>锁——————>锁.方法
 * 			线程同步：数据安全          线程间通信:协作
 * */

class Resource{
	private int id;
	private String name;
	boolean flag = false;   //是否有产品
	
	//生产:同步方法：锁---this
	public synchronized void set(int id, String name) {
		//1、产品是否存在
		if (this.flag) {  //停产、休息：线程释放CPU
			try {
				this.wait();   
			} catch (InterruptedException e) {
				e.printStackTrace();
			}								
		} 		
		//生产
		this.id = id;
		this.name = name;
		System.out.println();
		//通知销售
		this.flag = true;
		this.notify();
	}
	
	//销售一部
	public synchronized void sales() {
		//1、有无产品
		if (!this.flag) {   //没产品
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}		
		//2、销售
		System.out.println("卖：name:"+this.name +"\t id:"+this.id);		
		//3、卖完了
		this.flag = false;
		this.notify();     //通知
	}				
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
				switch (key++%3) {
				case 0:
					r.set(6666,"iphone6");
					break;
				case 1:
					r.set(7777, "iphone7");
					break;
				case 2:
					r.set(8888, "iphone8");
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
		r.sales();
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


