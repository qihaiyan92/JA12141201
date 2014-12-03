//数组：存放同种数据类型的与元素:下标范围【0，N-1】
public class ArrayTest{
     public static void main(String  args[]){
	   //声明数组:变量在栈空间
	   int[] arr;         //建议使用这种
       //int arr[];	     //  声明数组时用这个也行，但建议使用上面的 
	    int test[10];    //声明数组时，不可以指定大小
	    
		//初始化：在堆空间存储
		arr =new int[10];
		arr1={1,2,3};
		
		//声明+初始化
        String[]  str=new String[5];    // 默认初始化
		int[] arrInt=new int[]{123,564,895};
		Sting[] IT=new String[]{"Java","c","c++","Android"}; 
		Sting[] IT=            {"Java","c","c++","Android"};    //对上面的简写

	}
	 }