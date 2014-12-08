public class Sub extends Base{
	String str="sub class";   //子类特有属性
	void sub_show(){
		System.out.println("sub类特有的方法");
	}
	void show(){
		System.out.println("子类复写了父类的方法sub class");
	
	}
	public static void main(String[] args){
	
	//向上转型：默认基类引用  指向  子类对象
	//不能访问子类新增的属性，可以访问基类特有属性、被子类覆盖方法
	   Base base=new Sub();
	   
	   
	   //一个基类的引用不可以访问其子类对象
	  /*  System.out.println(base.str);
	   base.sub_show; */
	   
	   System.out.println(base.a);
	   base.base_show();
	   
	   //System.out.println(base.a);
	   base.show();
	   
	   /* //向下转型：子类的引用  指向  父类的对象
	   Sub sub = (Sub)new Base();
	   
	   //访问父类的属性
	   System.out.println(sub.a);
	   sub.base_show();
	   
	   //子类复写父类的方法
	   sub.show();
	   
	   //访问子类的属性 */
	} 


}