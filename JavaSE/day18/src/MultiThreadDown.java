
public class MultiThreadDown {

	public static void main(String[] args) throws Exception {
		// ��ʼ��DownUtil����
		final DownUtil downUtil = new DownUtil("http://www.crazyit.org/"+"attachment.php?aid=MTY0NXxjNjBiYzNjN3wxMzE1NTQ2MjU5fGNhO"
				+"DlKVmpXVmhpNGlkWmVzR2JZbnluZWpqSllOd3JzckdodXJOMUpOWWt0aTJz,"
				,"oracelsql.rar", 4);
		//��ʼ����
		downUtil.download();
		new Thread(){
			public void run(){
				while (downUtil.getCompleteRate()<1) {
					System.out.println("����ɣ�"+downUtil.getCompleteRate());
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					
					}			
				}
			}
		}.start();
	}
}
