package in.oop.inheritence;

public class Rectangle extends Shape{
	int width=10;
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double Area(){
		double d= length*width;
		return d;
		
	}
	
	
	public static void main(String []args){
		Rectangle r =new Rectangle();
		r.setLength(15);
		r.setBorderWidth(6);
		r.setColor("purple");
		double d= r.Area();
		System.out.println("Area of Rectangle = "+d);
		System.out.println("BorderWidth of Rectangle = "+r.getBorderWidth()+"cm");
		System.out.println("Color of Rectangle = "+r.getColor());
	}

}
