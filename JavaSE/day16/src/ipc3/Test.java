package ipc3;

import ipc3.Input;
import ipc3.Output;
import ipc3.Resource;
/*
 * ���̣߳��߳�����ϵͳ��
 * �߳�������ͬ�Ķ��̣߳�
 *	1����ôȥ��ù������ݣ�-------һ�ι�����
 * 	2����ô��֤input��output�߳�ͬ����
 * 	3������ ==������
 * �߳�ͨ�ţ� �ȴ�---����
 * 		wait���ͷ������ͷ�CPU�������̳߳�
 * 		notify�� ͨ��ָ���ļ��������������ѡ�
 * 		notifyAll
 * ʹ��ͬһ���������÷��� ==
 * 					  ����
 * 		�������ݡ�������������>��������������>��.����
 * 			�߳�ͬ�������ݰ�ȫ          �̼߳�ͨ��:Э��
 * */

class Resource{
	private int id;
	private String name;
	boolean flag = false;   //�Ƿ��в�Ʒ
	
	//����:ͬ����������---this
	public synchronized void set(int id, String name) {
		//1����Ʒ�Ƿ����
		if (this.flag) {  //ͣ������Ϣ���߳��ͷ�CPU
			try {
				this.wait();   
			} catch (InterruptedException e) {
				e.printStackTrace();
			}								
		} 		
		//����
		this.id = id;
		this.name = name;
		System.out.println();
		//֪ͨ����
		this.flag = true;
		this.notify();
	}
	
	//����һ��
	public synchronized void sales() {
		//1�����޲�Ʒ
		if (!this.flag) {   //û��Ʒ
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}		
		//2������
		System.out.println("����name:"+this.name +"\t id:"+this.id);		
		//3��������
		this.flag = false;
		this.notify();     //֪ͨ
	}				
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
				
				//3���в�Ʒ��֪ͨ����
				r.flag = true;
				r.notify();			
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
		r.sales();
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


