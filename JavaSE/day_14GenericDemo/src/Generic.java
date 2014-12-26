class Base<T>{
	
}
public class Generic {
	public static void test(Base<?> base){
		System.out.println("this is test");
	}
	public static void main(String[] args) {
		Base<String> base = new Base<>();
		test(base);
		//Base<int> base1 = new Base<>();   //尖括号中不能使用基本类型
		Base<Integer> base2  = new Base<>();
	}

}
