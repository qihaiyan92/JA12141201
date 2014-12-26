
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
	void run(int[] arr,int index) throws FuException{
		//�ֶ��׳��쳣
		if(arr == null){
			//�쳣����new +���췽��
			//throw new NullPointerException();   //�޲ι���
			throw new NullPointerException("��ָ���쳣");
		}
		//�Զ����쳣��JVM--new---throw---->main---->JVM--->����̨
      	//System.out.println(arr[index]); //throw  new ArrayIndexOutOfBoundsException();
		if (index < 0) {
			//throw new ArrayIndexOutOfBoundsException("�±긺");  //�ֶ��׳��쳣
			//�ֶ��׳����Զ����쳣
			throw new FuException("�Զ���--���±��쳣");   //�׳�����jvm����runtime��
			
		}else if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index="+index+">= ���鳤��"+arr.length);
		}else {
		System.out.println(arr[index]);
		}
	}
}
public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] array = null;
		//һ����main�����У�ֱ�ӷǷ���������
    	//arr[5] = 1232;      //ArrayIndexOutOfBoundsException
		//array[0]=123;         //NullPointerException   ��ָ���쳣
		
	 Test test = new Test();
	//�Զ����쳣��JVM--new---throw---->main---->JVM--->����̨
	 //test.run(arr, -2);   //��ʶ�Դ���
	 //test.run(arr, 5);    //throw  new ArrayIndexOutOfBoundsException();
	//test.run(array, 1);    //NullPointerException   ��ָ���쳣

		
	//�������ó�Ա�������ڳ�Ա�����зǷ���������
		//run(array, 6);
		
	 System.out.println("========end=========");
	}
  public static void run(int[] arr, int index){
	  
	  System.out.println(arr[index]);
	  System.out.println("========run   end=========");
  }
}
