package in.core.constructor;

public class Circle extends Shape {
	
	private int radius;
		
	public Circle(int r) {
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public double area(){
		double d= p*radius*radius;
		return d;
	}
	
	public static void main(String[] args){
		
		Circle c= new Circle (5);
		//c.setRadius(7);
		c.setBorderWidth(6);
		c.setColor("White");
		double s= c.area();
		System.out.println("Area of circle ="+s);
		System.out.println("BorderWidth of circle ="+c.getBorderWidth()+"cm");
		System.out.println("Color of circle ="+c.getColor());
		
	}

	

}
