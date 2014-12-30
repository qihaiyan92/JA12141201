package serialize.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
 * 1�������л�����
 * 2����ô���л���
 * 		a������ObjectOutputStream��������󣺴����� == ���ڽڵ�
 * 		b��IO:   writeObject()
 * 
 * [�ڴ�]����------>IO�����----->����------>IO������----->�ڴ�
 * 					���л�				�����л�
 * */
public class WriteObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person(100, "google");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		try {
			//�ڵ������ֽ���
			fos = new FileOutputStream("obj.txt");
			//������
			oos = new ObjectOutputStream(fos);
			} catch (IOException e) {
				e.printStackTrace();			
		}
		
		
	}

}
