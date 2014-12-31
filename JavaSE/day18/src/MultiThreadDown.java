
public class MultiThreadDown {

	public static void main(String[] args) throws Exception {
		// 初始化DownUtil对象
		final DownUtil downUtil = new DownUtil("http://www.crazyit.org/"+"attachment.php?aid=MTY0NXxjNjBiYzNjN3wxMzE1NTQ2MjU5fGNhO"
				+"DlKVmpXVmhpNGlkWmVzR2JZbnluZWpqSllOd3JzckdodXJOMUpOWWt0aTJz,"
				,"oracelsql.rar", 4);
		//开始下载
		downUtil.download();
		new Thread(){
			public void run(){
				while (downUtil.getCompleteRate()<1) {
					System.out.println("已完成："+downUtil.getCompleteRate());
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					
					}			
				}
			}
		}.start();
	}
}
