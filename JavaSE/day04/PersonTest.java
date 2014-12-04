//测试Person类
public class PersonTest{
     public static void main(String[] args){
	     //实例化:引用=变量=实例
		 // 在定义类的时候【没有】自定义无参构造函数，编译系统自动指定构造器
         // 在定义类的时候【  有】自定义无参构造函数，使用自定义的构造器
	     Person geminno = new Person(); 
		 Person gem = new Person("高博"); 
		 Person gemptc = new Person("高博集团",12); 
		 
		 
		 //对象使用：引用.成员变量    引用.成员方法
		// System.out.println("Name:"+geminno.name+"Age:"+geminno.age);
		 geminno.info();
		 gem.info();
		 gemptc.info();

	 }//end main 
}//end class