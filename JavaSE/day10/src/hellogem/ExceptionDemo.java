package hellogem;

<<<<<<< HEAD
import org.omg.CORBA.PUBLIC_MEMBER;

//�Զ����쳣�ࣺ����̳�exception�쳣��������=�׸��������ĵ����ߣ�==throw throws�ؼ����׳�
//ʵ�����߼�����  ��  �쳣����  �ķ���

class FuException extends Exception{
	public FuException(){}
	public FuException(String message){
		super(message);
	}
}

//��װ��    ��ʾ�׳��쳣������
class Test{
	void run(int[] arr,int index){
		//�ֶ��׳��쳣
		if(arr == null){
			//�쳣����new +���췽��
			//throw new NullPointerException();   //�޲ι���
=======
//��װ��    ��ʾ�׳��쳣������
class Test{
	void run(int[] arr,int index){
		if(arr == null){
>>>>>>> origin/master
			throw new NullPointerException("��ָ���쳣");
		}
		//�Զ����쳣��JVM--new---throw---->main---->JVM--->����̨
      	//System.out.println(arr[index]); //throw  new ArrayIndexOutOfBoundsException();
		if (index < 0) {
<<<<<<< HEAD
			//throw new ArrayIndexOutOfBoundsException("�±긺");  //�ֶ��׳��쳣
			//�ֶ��׳����Զ����쳣
			throw new FuException();
			
		}else if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index="+index+">= ���鳤��"+arr.length);
=======
			throw new ArrayIndexOutOfBoundsException("�±긺");
		}else if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index >= ���鳤��"+arr.length);
>>>>>>> origin/master
		}else {
		System.out.println(arr[index]);
		}
	}
}
public class ExceptionDemo {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		int[] arr = new int[5];
		int[] array = null;
		//һ����main�����У�ֱ�ӷǷ���������
    	//arr[5] = 1232;      //ArrayIndexOutOfBoundsException
=======
		int[] array = null;
		//arr[5] = 1232;      //ArrayIndexOutOfBoundsException
>>>>>>> origin/master
		//array[0]=123;         //NullPointerException   ��ָ���쳣
		
	 Test test = new Test();
	//�Զ����쳣��JVM--new---throw---->main---->JVM--->����̨
	 //test.run(arr, -2);   //��ʶ�Դ���
	 //test.run(arr, 5);    //throw  new ArrayIndexOutOfBoundsException();
	//test.run(array, 1);    //NullPointerException   ��ָ���쳣
<<<<<<< HEAD

		
	//�������ó�Ա�������ڳ�Ա�����зǷ���������
		//run(array, 6);
		
	 System.out.println("========end=========");
	}
  public static void run(int[] arr, int index){
	  
	  System.out.println(arr[index]);
	  System.out.println("========run   end=========");
  }
=======
	 
	 System.out.println("========end=========");
	}

>>>>>>> origin/master
}
