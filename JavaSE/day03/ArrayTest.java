//变量：只能存放一个数据
//数组：存放同种数据类型【基本数据类型、引用数据类型】的与元素:下标范围【0，N-1】
//特点：1、随机访问能力强 2、长度固定 3、移动数据效率低
public class ArrayTest{
     public static void main(String[]  args){
	   //1、声明数组:没有指定数组空间，不可以指定大小
	   //变量在栈空间:函数中变量：局部变量、形参
	   int[] arr;         //建议使用这种
       int arr1[];	     //  声明数组时用这个也行，但建议使用上面的 
	   double d_arr[];
	   // int test[10];    //error, 声明数组时，不可以指定大小
	    
		//初始化:必须制定大小【显示、隐式】创建空间
		//创建控件+初始化值=在堆空间存储
		arr =new int[10];  //显示
		d_arr=new double[10];
		arr1=new int[]{1,2,3};  //隐式
		
		
		System.out.println("arr[0]="+arr[0]);
		System.out.println("d_arr[0]="+d_arr[0]);
		
		//声明+初始化
        String[]  str=new String[5];    // 默认初始化:动态初始化
		Object[] obj = new String[5];   //实际元素类型 是 数组类型的子集
		int[] arrInt=new int[]{123,564,895};
		String[] IT=new String[]{"Java","c","c++","Android"}; 
		String[] IT1=            {"Java","c","c++","Android"};    //对上面的简写
        //匿名数组=0引用：数组只使用一次的情况
		System.out.println(
		(new String[]{"Apple","Google","Alibaba","Tesla"})[2]);

	    //使用数组
        System.out.println("IT[0]="+IT[0]);
		
		//数组的遍历
		//for+数组长度
		for(int i=0;i<IT.length;i++){
		System.out.println("IT:"+IT[i]+"\t");
		}
		System.out.println("");//换行
		//for each:遍历数组、集合
		for(String ele:IT){
		     System.out.println("IT"+ele);
		}
		System.out.println("");//换行
		//数组拷贝
		String[] it_copy=IT;
		for(String ele:it_copy){
		     System.out.println("IT"+ele);
			 }
		System.out.println("");//换行	 
	    it_copy[0]="python";
		//for(String ele:it_copy){
		for(String ele:IT){     //多个引用指向同一个空间【数组对象】
		     System.out.println("IT"+ele);
			 }
		
         
		 
		 //命令行
		 for(String str1:args){
		   System.out.println(str1);
		 }
		 
		 //
		 int[] test=null;
		 System.out.println("test[0]="+test[0]);
	}
	 }