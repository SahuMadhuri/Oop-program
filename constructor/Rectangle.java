package in.core.constructor;

public class Rectangle extends Shape {
	private int width;
	private int length;
	public Rectangle(int w,int l) {
		width=w;
		length=l;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double area(){
		double d= length*width;
		return d;
	}
	public static void main(String[]args){
		Rectangle r= new Rectangle(7,9);
		r.setColor("Orange");
		r.setBorderWidth(8);
		double a=r.area();
		System.out.println("Area of Rectangle ="+a);
		System.out.println("BorderWidth of Rectangle ="+r.getBorderWidth());
		System.out.println("Color of Rectangle ="+r.getColor());
	}
	

}
