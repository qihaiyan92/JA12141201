public class Test{
	public static void main(String[] args){
		//MiWifi mi=new MiWifi();
		
		USB_WIFI mi = new MiWifi();   //����
		
        //MiWiFi mi2 = (MiWiFi)mi;      //����
		//System.out.println(mi2.brand);		
		System.out.println( ( (MiWifi)mi ).brand);
		
		mi.open();
		mi.close();
		mi.read();
		mi.write();
		mi.usb2wifi();
	
	}

}