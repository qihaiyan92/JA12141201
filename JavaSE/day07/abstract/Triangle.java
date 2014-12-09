public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;

	//无参和两参构造器
	public Triangle(){}
	public Triangle(String color ,double a,double b,double c){
		super(color);
		this.setSides(a,b,c);
	}
	
	
	public void setSides(double a,double b,double c){
		if(a >=b+c || b >=a+c || c >=a+b){
			System.out.println("三角形两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	//子类的义务：重写 
    public double calPerimeter(){
		return a+b+c;
	}
	public String getType(){
		return getColor()+"三角形";
	}
}