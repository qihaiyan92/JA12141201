class Father<T>{}

public class Limited {
	//? super Number---->Number����丸��
	public static void test(Father<? super Number> father){
		
		System.out.println("this is test");
	}
	
	//? extends Number---->Number���������
	public static void show(Father<? extends Number> father){
		
		System.out.println("this is show");
	}	
	public static void main(String[] args) {
		Father<Integer> f1 = new Father<>();   //number  ����
		Father<Object> f2 = new Father<>();
		//test(f1);  ����ʵ��ֻ����Number����丸��
		test(f2);
		show(f1);
		//show(f2);   ����ʵ��ֻ����Number���������
	}

}
