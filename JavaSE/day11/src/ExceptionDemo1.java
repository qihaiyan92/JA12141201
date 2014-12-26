
//自定义异常类：必须继承exception异常，可抛性=抛给调用它的调用者，==throw throws关键字抛出
//实现了逻辑处理  和  异常处理  的分离

class FuException extends Exception{
	public FuException(){}
	public FuException(String message){
		super(message);
	}
}

//封装类    演示抛出异常的流程
class Test{
	void run(int[] arr,int index) throws FuException{
		//手动抛出异常
		if(arr == null){
			//异常对象：new +构造方法
			//throw new NullPointerException();   //无参构造
			throw new NullPointerException("空指针异常");
		}
		//自动抛异常：JVM--new---throw---->main---->JVM--->控制台
      	//System.out.println(arr[index]); //throw  new ArrayIndexOutOfBoundsException();
		if (index < 0) {
			//throw new ArrayIndexOutOfBoundsException("下标负");  //手动抛出异常
			//手动抛出：自定义异常
			throw new FuException("自定义--负下标异常");   //抛出——jvm处理【runtime】
			
		}else if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index="+index+">= 数组长度"+arr.length);
		}else {
		System.out.println(arr[index]);
		}
	}
}
public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] array = null;
		//一、在main函数中，直接非法操作数组
    	//arr[5] = 1232;      //ArrayIndexOutOfBoundsException
		//array[0]=123;         //NullPointerException   空指针异常
		
	 Test test = new Test();
	//自动抛异常：JVM--new---throw---->main---->JVM--->控制台
	 //test.run(arr, -2);   //常识性错误
	 //test.run(arr, 5);    //throw  new ArrayIndexOutOfBoundsException();
	//test.run(array, 1);    //NullPointerException   空指针异常

		
	//二、调用成员方法，在成员方法中非法操作数组
		//run(array, 6);
		
	 System.out.println("========end=========");
	}
  public static void run(int[] arr, int index){
	  
	  System.out.println(arr[index]);
	  System.out.println("========run   end=========");
  }
}
