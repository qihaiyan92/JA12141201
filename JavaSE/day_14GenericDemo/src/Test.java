
class More<K,V>{
	K name;
	V age;
	public  More(K name, V age){
		this.name=name;
		this.age=age;
	}
	public K show(){
		return name;
	}
}


public class Test<T>{
	public Test(T A){
		System.out.println(A);
	}
	public static void main(String[] args) {
		Test test = new Test("hello");
		More<String, Integer> more = new More<String,Integer>("LiLei",20);
	}

}
