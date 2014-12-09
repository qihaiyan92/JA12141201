
public class Test {
    public static void main(String[] args){
		Shape san = new Triangle();
		san.setColor("red");
		
		Triangle si = (Triangle)san;
        si.setSides(3,4,5);
		
		System.out.println(san.getType()+"周长"+san.calPerimeter());
		
		
	/* Shape s11 = new Triangle();
    Shape s22 = new Circle();
	s11.setColor("黄");
	s11.setSiders(6.0,7.0,8.0);
	
	s22.setColor("绿");
	s22.setR(10);
	System.out.println(s11.getType());
	System.out.println("周长是:"+s11.calPerimeter());
	System.out.println(s22.getType());	
	System.out.println("周长是:"+s11.calPerimeter()); */
}

}