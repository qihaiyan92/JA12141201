package serialize.obj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 反序列化：                                                                                                          节点流
 * 		1、ObjectOutputStream输入流对象：==处理流==基于FileInputStream
 * 		2、readObject()-----若知道具体类，需要强转
 * */
public class ReadObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			//节点流
			FileInputStream fis = new FileInputStream("obj.txt");
			//处理流
			ObjectInputStream ois = new ObjectInputStream(fis);
			//IO:读取
		    Person P2 = (Person)ois.readObject();
		    
		    System.out.println("name:"+P2.getName()+"\tage:"+P2.getAge());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		
		}

	}

}
