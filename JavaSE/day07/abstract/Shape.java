//�����ࡾֻ�ܱ��̳С�---->���ࣺʵ�����г��󷽷�----> ����
//��������                  ������
public abstract class Shape{
	//�������6��ɣ�
	{
	System.out.println("ִ��Shape�ĳ�ʼ����....");
	}
	private String color;
	
	//�ܳ�  ���󷽷���û��{}
	public abstract double calPerimeter();
	//��״  ���󷽷���
	public abstract String getType();
	
	//����Shape�Ĺ��������ù��������������ڴ���Shape���󣬶������ڱ��������
	public Shape(){}
	public Shape(String color){
		System.out.println("ִ��Shape�Ĺ�����....");
		this.color=color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}