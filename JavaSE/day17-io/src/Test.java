import java.io.FileWriter;
import java.io.IOException;


/*
 * �ļ��ж��쳣�Ĵ���
 * */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�ַ������
		FileWriter fw = null;
		try {
			fw = new FileWriter("baidu.txt");
			fw.write("�ٶ�ɱ��");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{  //�ر�ϵͳ��Դ
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
	}

}
