package hellogem;

//��װ��    ��ʾ�׳��쳣������
class Test{
	void run(int[] arr,int index){
		if(arr == null){
			throw new NullPointerException("��ָ���쳣");
		}
		//�Զ����쳣��JVM--new---throw---->main---->JVM--->����̨
      	//System.out.println(arr[index]); //throw  new ArrayIndexOutOfBoundsException();
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("�±긺");
		}else if(index > arr.length) {
			throw new ArrayIndexOutOfBoundsException("index >= ���鳤��"+arr.length);
		}else {
		System.out.println(arr[index]);
		}
	}
}
public class ExceptionDemo {
	
	public static void main(String[] args) {
		int[] array = null;
		//arr[5] = 1232;      //ArrayIndexOutOfBoundsException
		//array[0]=123;         //NullPointerException   ��ָ���쳣
		
	 Test test = new Test();
	//�Զ����쳣��JVM--new---throw---->main---->JVM--->����̨
	 //test.run(arr, -2);   //��ʶ�Դ���
	 //test.run(arr, 5);    //throw  new ArrayIndexOutOfBoundsException();
	//test.run(array, 1);    //NullPointerException   ��ָ���쳣
	 
	 System.out.println("========end=========");
	}

}
