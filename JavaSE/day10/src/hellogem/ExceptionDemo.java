package hellogem;

//封装类    演示抛出异常的流程
class Test{
	void run(int[] arr,int index){
		if(arr == null){
			throw new NullPointerException("空指针异常");
		}
		//自动抛异常：JVM--new---throw---->main---->JVM--->控制台
      	//System.out.println(arr[index]); //throw  new ArrayIndexOutOfBoundsException();
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("下标负");
		}else if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index >= 数组长度"+arr.length);
		}else {
		System.out.println(arr[index]);
		}
	}
}
public class ExceptionDemo {
	
	public static void main(String[] args) {
		int[] array = null;
		//arr[5] = 1232;      //ArrayIndexOutOfBoundsException
		//array[0]=123;         //NullPointerException   空指针异常
		
	 Test test = new Test();
	//自动抛异常：JVM--new---throw---->main---->JVM--->控制台
	 //test.run(arr, -2);   //常识性错误
	 //test.run(arr, 5);    //throw  new ArrayIndexOutOfBoundsException();
	//test.run(array, 1);    //NullPointerException   空指针异常
	 
	 System.out.println("========end=========");
	}

}
