package in.oop.polymorphismMethodArguments;



public class Circle extends Shape{
	int radius=7;
	public double area(){
		double d= p*radius*radius;
		return d;
	}
	public static void main(String[] args){
		Circle c= new Circle ();
		//c.setRadius(7);
		//c.setBorderWidth(73);
		//c.setColor("yellow");
		double s= c.area();
		System.out.println(s);
		//System.out.println(c.getBorderWidth());
		//System.out.println(c.getColor());
		
	}
}
