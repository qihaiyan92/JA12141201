class Base<T>{
	
}
public class Generic {
	public static void test(Base<?> base){
		System.out.println("this is test");
	}
	public static void main(String[] args) {
		Base<String> base = new Base<>();
		test(base);
		//Base<int> base1 = new Base<>();   //�������в���ʹ�û�������
		Base<Integer> base2  = new Base<>();
	}

}
