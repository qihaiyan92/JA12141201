

/*
 * 异常处理:       自动抛出
 * 1、runtime异常：程序员--抛出     VS   JVM---自动处理
 * 2、checked异常：程序员--抛出     VS   程序员---自动处理 
 * 
 * checked异常：
 * 1、【程序员】手动异常处理之一：throws
 * 2、【程序员】手动异常处理之二：try catch finally
 * 
 * 程序员要考虑的：
 * 1、什么时候会发生异常？
 * 2、发生的是什么异常？   runtime  checked
 * 3、根据异常类型，来考虑异常怎么处理
 	a、runtime     JVM
 	b、checked:               when？                                    how？                                                                                                                              ---某个上级解决--->继续执行---完成
 	  |——什么时候用throws   ===不知道如何解决                    1、  函数签名：throws+checked异常类名   ----抛给调用者---调用者解决？---上级都解决不了--->JVM---中断
 	                                        2、可以throws声明多个异常，提示调用者
 	  |——什么时候用try catch     ===知道如何解决
   4、catch(){}   -----?
*/

//自定义checked异常：继承
class FuIndexException extends Exception{
	public FuIndexException(){}
	public FuIndexException(String message){
		super (message);	
	}
	@Override
	public String toString() {
		
		return "程序员catch处理："+this.getMessage();
	}
	
}

class Demo{
		/*
		 *     判断异常-----抛出异常---------处理异常
		 *runtime        代码                                     JVM
		 *checked    =========程序员处理========
		 *
		 *分离
		 * */
		public void run(int[] arr,int index)throws FuIndexException,NullPointerException,ArrayIndexOutOfBoundsException{
			if (arr==null) {
				throw new NullPointerException("JVM:空指针异常");
			}
			if (index >=arr.length ) {
				throw new NullPointerException("JVM:index大于了数组的长度");
			}else if (index < 0) {				
				throw new FuIndexException("程序员处理：index负数");
			}else {
				System.out.println(arr[index]);
			}
	}
	
}
public class DiyTest {
	public static void main(String[] args) {
		int[] array = new int[5];
		int[] arr = null;
		Demo demo=new Demo();
		
		//array[-12]=123;
		
		try {
			//demo.run(array, -12);   //从哪里看抛出异常
			//demo.run(arr, 123);
			demo.run(array, 123);
			
		}catch (FuIndexException fu) {
			fu.printStackTrace();
			System.out.println(fu);
			System.out.println(fu.toString()+"\n"+fu.getMessage());
		}catch(NullPointerException e){
			System.out.println("进入catch语句");
			System.out.println(e);
			e.printStackTrace();
			//return    //finally
			//System.exit(123);
		}catch(Exception e){   //所有     catch顺序：先catch子类，后catch父类
			System.out.println(e);
		}finally{
			System.out.println("finally");
			
		}
		
		System.out.println("=======end=======");

	}

}
