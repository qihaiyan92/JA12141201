/*
 * ���̣��ǲ���ϵͳ��Ӧ�ó�����Դ���䡢���̵��ȵ���С��λ�����������еĳ���
 * �̣߳���ϵͳ��ִ���������С��λ���������ִ�е���С��λ�����̵Ķ��ִ������
 *      �߳����Լ����е�����
 *      
 *         ����ִ��/ͬʱ
 *  ������
 *  ����̣�
 *  ���̣߳�
 *  	����ϵͳ�����̡��̷߳���ǳ�С��ʱ��Ƭ����OSȥ���ȡ�����л�===����Ͽ���ͬʱִ��
 *  
 *  JVM������Ķ��̣߳�
 *  	1��main�߳�
 *  	2�����������̣߳�
 *  Java�� object ����+����	
 *  
 *  
 * */

class A{
	
	//�漰��ϵͳ����Դ��ʱ����Ҫ����дһ�¸÷�����
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�ֶ���������");
		System.out.println(Thread.currentThread().getId()+"\t"+Thread.currentThread().getName());
		super.finalize();
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId()+"\t"+Thread.currentThread().getName());
		A a = new A();
		new A();
		new A();
		System.gc();
		new A();
		//System.gc();
		new A();
		
		System.out.println("main����");
	}

}
