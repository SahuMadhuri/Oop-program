package in.oop.inheritence;

public class Circle extends Shape{
   
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double Area(){
		double d= p*radius*radius;
		return d;
	}
	public static void main(String[] args){
		Circle c= new Circle ();
		c.setRadius(7);
		c.setBorderWidth(3);
		c.setColor("Yellow");
		double s= c.Area();
		System.out.println("Area of circle = "+s);
		System.out.println("BorderWidth of circle = "+c.getBorderWidth()+"cm");
		System.out.println("Color of circle = "+c.getColor());
		
	}
}
