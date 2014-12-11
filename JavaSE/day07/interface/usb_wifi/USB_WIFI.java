//接口的多继承：继承接口+新增特有常量、抽象方法
//接口 + 继承接口 + 完成实现类 + 实例化
//继承了USB,Wifi
public interface USB_WIFI extends USB,Wifi{
	
	void usb2wifi();   //定义一个抽象方法

}