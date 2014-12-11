public class Test{
	public static void main(String[] args){
	//继承的向上转型 VS 接口、实现类的向上转型
	
		USB T1 = new USB_KEY();
		//System.out.println(T1.brand);   //error  brandclass USB中的属性
		T1.read();
		T1.write();
		
		Udisk T2 = new Udisk();
		T2.read();
		T2.write();
	
	}
}