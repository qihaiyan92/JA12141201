package ipc2;

import ipc2.Input;
import ipc2.Output;
import ipc2.Resource;
/*
 * ���̣߳��߳�����ϵͳ��
 * �߳�������ͬ�Ķ��̣߳�
 * 
 * 1����ôȥ��ù������ݣ�-------һ�ι�����
 * 2����ô��֤input��output�߳�ͬ����
 * 3������ ==������
 * */

class Resource{
	int id;
	String name;
	boolean flag = false;   //�Ƿ��в�Ʒ
}

/*����:��Ʒ�Ƿ�����ȥ�ˣ�  ��ȥȷ���Ƿ񿪹�����������
 * 	�У�1��֪ͨ����   2��������
 * 	�ޣ�1������֪       2������
 * */

class Input implements Runnable{
	Resource r;
	//���������Գ�Ա���� r���г�ʼ��
	public Input(Resource r) {
		super();
		this.r = r;
	}
	int key = 0;
	@Override
	public void run() {		
		while (true) {
			synchronized (r) {	
				
				//1����Ʒ�Ƿ����
				if (r.flag) {  //ͣ������Ϣ���߳��ͷ�CPU
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}								
				} 
				
				//2����������
				switch (key++%3) {
				case 0:
					r.id = 6666;
					r.name = "iphone6"; 
					System.out.println("����iphone6");
					break;
				case 1:
					r.id = 7777;
					r.name = "iphone7";
					System.out.println("����iphone7");
					break;
				case 2:
					r.id = 8888;
					r.name = "iphone8"; 
					System.out.println("����iphone8");
					break;

				default:
					break;
				}	
				
				//3���в�Ʒ��֪ͨ����
				r.flag = true;
				r.notify();
			}			
		}
	}
}

/*
 * ���ۣ��Ƿ��в�Ʒ����
 * �У�1�������߸�֪      2������
 * �ޣ�1��֪ͨ����      2����Ϣ��ֹͣ����
 * */
class Output implements Runnable{
	Resource r;
	//���������Գ�Ա���� r���г�ʼ��
	public Output(Resource r) {
		super();
		this.r = r;
	}
	@Override
	public void run() {		
		while (true) {
			synchronized (r) {
				
				//1�����޲�Ʒ
				if (!r.flag) {   //û��Ʒ
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
				}
				
				//2������
				System.out.println("����name:"+r.name +"\t id:"+r.id);
				
				//3��������
				r.flag = false;
				r.notify();     //֪ͨ
			}			
		}
	}	
}
public class Test {
	public static void main(String[] args) {
		//1������������Դ
		Resource r = new Resource();
		
		//2�������߳�����run
		Input input = new Input(r);
		Output output = new Output(r);
		
		//3�������̶߳���
		Thread th_in = new Thread(input);
		Thread th_out = new Thread(output);
		
		//4������
		th_in.start();
		th_out.start();

	}

}

