package in.oop.overriding;

public class Circle extends Shape {
	private int radius=0;
	public Circle(int radius){
		this.radius=radius;
	}
	public double Area(){
		double d= p*radius*radius;
		return d;
	}
	public static void main(String[]args){
		Shape s= new Circle(5);
		s.setColor("yellow");
		s.setBorderWidth(9);
		System.out.println("BorderWidth is= "+s.getBorderWidth());
		System.out.println("Color is= "+s.getColor());
		System.out.println("Area of circle is= "+s.Area());
	}
	

}
