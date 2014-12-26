
public class One implements Runnable{
	static int ticket = 10;  //共有十张票出售
	static int num = 0;    //当前卖出的票数
	public void run(){
		for (int i = 0; i <= 10; i++) {
			if (ticket > 0) {
				ticket--;
				num++;
				System.out.println(Thread.currentThread().getName() + "卖出了第"+num +"张车票，还剩"+ticket+"张车票");
			}
		}
		
	}
	public static void main(String[] args) {
		One t = new One(); 
		Thread O1 =new Thread(t);
		Thread O2 =new Thread(t);
		Thread O3 =new Thread(t);
		O1.setName("第一个售票窗口");
		O2.setName("第二个售票窗口");
		O3.setName("第三个售票窗口");
		O1.start();
		O2.start();
		O3.start();

	}

}
