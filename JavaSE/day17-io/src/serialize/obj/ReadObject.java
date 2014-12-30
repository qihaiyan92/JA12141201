package serialize.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * �����л���                                                                                                          �ڵ���
 * 		1��ObjectOutputStream����������==������==����FileInputStream
 * 		2��readObject()-----��֪�������࣬��Ҫǿת
 * */
public class ReadObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			//�ڵ���
			FileInputStream fis = new FileInputStream("obj.txt");
			//������
			ObjectInputStream ois = new ObjectInputStream(fis);
			//IO:��ȡ
		    Person P2 = (Person)ois.readObject();
		    
		    System.out.println("name:"+P2.getName()+"\tage:"+P2.getAge());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		
		}

	}

}
