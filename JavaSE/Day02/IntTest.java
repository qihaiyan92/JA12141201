public class IntTest{
     public static void main(String args[]){
	     //С���ͳ���Ĭ���Զ�ת��int����  
	    int num = 88;
		//�����ͳ��������Զ�ת��long���� 
		//long long1 =88888888888888;
		long long1 =88888888888888L;//�����Ǵ�дL
		long long2 =88888888888888l;
	   //�˽��Ʊ�ʾ���ͣ� ��0��ͷ
	   int var = 013;
	    System.out.println("var:" +var );
	   //16���Ʊ�ʾ���ͣ���0X��ͷ����0x��ͷ
	   int hexNum = 0xFF;
	   int hexNum1 = 0X1F;
	    System.out.println("hexNum:" +hexNum + "\n hexNum1" + hexNum1 );
	   //2���Ʊ�ʾ���ͣ���0B��ͷ����0b��ͷ 
	   byte byteNum = (byte)0b11111111;    //error
	   int intNum = 0b11111111;  
	   System.out.println("intNum:" +intNum+"\n byteNum" + byteNum);
	   
	 }
}