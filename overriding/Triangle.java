package in.oop.overriding;

public class Triangle extends Shape{
	private int base;
	private int height;
	public Triangle(int base,int height){
		this.base=base;
		this.height=height;
			}
	public double Area(){
		double d= 0.5*base*height;
		return d;
	}
	public static void main(String[] args) {
		Shape s= new Triangle(4,5);
		s.setColor("White");
		s.setBorderWidth(9);
		s.getColor();
		
		s.getBorderWidth();
		System.out.println("BorderWidth of triangle = "+s.getBorderWidth());
		System.out.println("Color of triangle = "+s.getColor());
		System.out.println("Area of triangle = "+s.Area());
	}
	
	

}
