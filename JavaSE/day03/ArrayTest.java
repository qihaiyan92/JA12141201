//������ֻ�ܴ��һ������
//���飺���ͬ���������͡������������͡������������͡�����Ԫ��:�±귶Χ��0��N-1��
//�ص㣺1�������������ǿ 2�����ȹ̶� 3���ƶ�����Ч�ʵ�
public class ArrayTest{
     public static void main(String[]  args){
	   //1����������:û��ָ������ռ䣬������ָ����С
	   //������ջ�ռ�:�����б������ֲ��������β�
	   int[] arr;         //����ʹ������
       int arr1[];	     //  ��������ʱ�����Ҳ�У�������ʹ������� 
	   double d_arr[];
	   // int test[10];    //error, ��������ʱ��������ָ����С
	    
		//��ʼ��:�����ƶ���С����ʾ����ʽ�������ռ�
		//�����ؼ�+��ʼ��ֵ=�ڶѿռ�洢
		arr =new int[10];  //��ʾ
		d_arr=new double[10];
		arr1=new int[]{1,2,3};  //��ʽ
		
		
		System.out.println("arr[0]="+arr[0]);
		System.out.println("d_arr[0]="+d_arr[0]);
		
		//����+��ʼ��
        String[]  str=new String[5];    // Ĭ�ϳ�ʼ��:��̬��ʼ��
		Object[] obj = new String[5];   //ʵ��Ԫ������ �� �������͵��Ӽ�
		int[] arrInt=new int[]{123,564,895};
		String[] IT=new String[]{"Java","c","c++","Android"}; 
		String[] IT1=            {"Java","c","c++","Android"};    //������ļ�д
        //��������=0���ã�����ֻʹ��һ�ε����
		System.out.println(
		(new String[]{"Apple","Google","Alibaba","Tesla"})[2]);

	    //ʹ������
        System.out.println("IT[0]="+IT[0]);
		
		//����ı���
		//for+���鳤��
		for(int i=0;i<IT.length;i++){
		System.out.println("IT:"+IT[i]+"\t");
		}
		System.out.println("");//����
		//for each:�������顢����
		for(String ele:IT){
		     System.out.println("IT"+ele);
		}
		System.out.println("");//����
		//���鿽��
		String[] it_copy=IT;
		for(String ele:it_copy){
		     System.out.println("IT"+ele);
			 }
		System.out.println("");//����	 
	    it_copy[0]="python";
		//for(String ele:it_copy){
		for(String ele:IT){     //�������ָ��ͬһ���ռ䡾�������
		     System.out.println("IT"+ele);
			 }
		
         
		 
		 //������
		 for(String str1:args){
		   System.out.println(str1);
		 }
		 
		 //
		 int[] test=null;
		 System.out.println("test[0]="+test[0]);
	}
	 }