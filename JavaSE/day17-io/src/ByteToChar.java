import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ByteToChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.in == �ֽ�������
		InputStreamReader isr = new InputStreamReader(System.in);
		//��װ
		BufferedReader br = new BufferedReader(isr);
		String buff = null;
		
		try {
			while ((buff=br.readLine()) != null) {
				if (buff.equals("exit")) {
					System.out.println("exit.....");
					System.exit(1);
				}
				System.out.println("���룺"+buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
