package in.oop.overloading;

public class Circle extends Shape {
	public double Area(int radius){
		double d=p*radius*radius;
		System.out.println("Area of Circle(int)= "+d);
		return d;
		
	}
	public double Area(double radius){
		double d=p*radius*radius;
		System.out.println("Area of Circle(double)= "+d);
		return d;
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.Area(8);
		c.Area(7.5);
		
	}

}
