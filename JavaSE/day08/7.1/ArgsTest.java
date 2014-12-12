public class ArgsTest{
	public static void main(String[] args){
		//输出args数组的长度
		System.out.println("参数长度："+ args.length);
		for(String arg:args){
			System.out.println("arg:"+arg);
		}
	}
}