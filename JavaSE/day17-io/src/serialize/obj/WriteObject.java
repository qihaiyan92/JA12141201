package serialize.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
 * 1、可序列化的类
 * 2、怎么序列化？
 * 		a、创建ObjectOutputStream输出流对象：处理流 == 基于节点
 * 		b、IO:   writeObject()
 * 
 * [内存]对象------>IO输出流----->磁盘------>IO输入流----->内存
 * 					序列化				反序列化
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
			//节点流：字节流
			fos = new FileOutputStream("obj.txt");
			//处理流
			oos = new ObjectOutputStream(fos);
			} catch (IOException e) {
				e.printStackTrace();			
		}
		
		
	}

}
