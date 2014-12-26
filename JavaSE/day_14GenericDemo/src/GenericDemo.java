
import java.util.TreeSet;

/*
 * 泛型：在程序中使用<>来指定具体类型
 *      可以用在类的定义、接口定义、方法定义、集合
 * 1、把运行时错误，提前到编译时，提早发现错误
 * 2、避免了强制类型转换的麻烦
 * */
public class GenericDemo {

	public static void main(String[] args) {
		
		//TreeSet ts = new TreeSet();
		TreeSet<String> ts = new TreeSet<>();
		ts.add("google");
		//ts.add(123);    //把运行时错误，提前到编译时，提早发现错误
		System.out.println(ts);
		
		for (Object object : ts) { //不使用泛型
			String str = (String)object;
			System.out.println(str);
		}
		
		for (String string : ts) {  //使用泛型
			System.out.println(string);
		}
	}

}
