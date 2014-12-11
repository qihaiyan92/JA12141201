//抽象类
abstract class USB{
	public abstract void read();
	public abstract void write();
}
//接口
interface Wifi{
	public abstract void open();
	public abstract void close();
}

public class Niming{
	public static void main(String[] args){
	//匿名内部类==特殊的局部内部类==子类的对象或者实现类的对象     遵从局部内部类的属性
		USB udisk = new USB(){
			int a;
			//static int b;    //error  不能定义静态
			final static int b=123;
			public void read(){
				System.out.println("读取U盘");
			}
			public void write(){
				System.out.println("写U盘");
			}
		};
		udisk.read();
		udisk.write();
		
		//wifi
		Wifi wifi = new Wifi(){
			public void open(){
				System.out.println("打开wifi");
			}
			public void close(){
				System.out.println("关闭wifi");
			}
		};
		wifi.open();
		wifi.close();
		
	}

}