package serialize.obj;

import java.io.Serializable;

/*
 * �������л������ڴ��ж��󣬱����ڴ��̡����紫��
 * ������--->ת��ƽ̨�޹صĶ�����---->���浽���̡�
 * ʵ�֣����������ķ���/  ������Կ����ʹ��
 * 
 * ���󶼿������л���
 *     No
 * ��ͨ����ô��ɿ����л����ࣿ
 * Serizlizable
 * Externallizeable
 * 
 * ���л���  �ڴ����----->IO��
 * �����л���   IO��----->�����ڴ桿
 * 
 * */
public class Person implements Serializable{
	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
