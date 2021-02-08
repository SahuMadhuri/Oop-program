package in.oop.overriding;

public class Rectangle extends Shape {
	private int length;
	private int width;
	public Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public double Area(){
	double d= length*width;
		return d;
	}
	public static void main(String[] args) {
		Shape s= new Rectangle(5,7);
		s.setBorderWidth(9);
		s.setColor("red");
		s.getBorderWidth();
		s.getColor();
		System.out.println("BorderWidth of Rectangle = "+s.getBorderWidth());
		System.out.println("Color of Rectangle = "+s.getColor());
		System.out.println("Area of Rectangle = "+s.Area());
		
		
	}

}
