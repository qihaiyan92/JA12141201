/*
 * main-------------------------------{}
 * Thread:�߳��࣬�߳����Լ��������ڶ����߳����ʱ����Ҫʵ�֣��� ��run����
 * 
 * һ���̳�Thread����������
 * 	1���̳�
 * 	2����дrun����������      // ����
 * 	3��ʵ�������̶߳���
 * 	4�������̣߳�start
 * */
class Monkey extends Thread{
	String name;
	public Monkey(String name){
		super();
		this.name = name;
		
	}
	public void fight(){
		for (int i = 1; i < 11; i++) {
			System.out.println(name+"��ܵ�"+i+"������콫");
		}
	}
	public void run(){
		fight();
		System.out.println(Thread.currentThread().getId()+"\t"+Thread.currentThread().getName());
	}
}

public class NotThread {

	public static void main(String[] args) {
		Monkey m1 = new Monkey("��һ��С���");
		Monkey m2 = new Monkey("�ڶ���С���");
		Monkey m3 = new Monkey("������С���");
		m1.setName("�߳�һ");
		m1.start();
		m2.start();
		m3.start();
		System.out.println(Thread.currentThread().getId()+"\t"+Thread.currentThread().getName());
	}

}
