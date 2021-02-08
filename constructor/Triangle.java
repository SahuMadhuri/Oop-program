package in.core.constructor;

public class Triangle extends Shape{
	private int length;
	private int height;
	public Triangle(int l,int h){
		length=l;
		height=h;
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double area(){
		double d= 0.5*length*height;
		return d;
	}
	public static void main(String[]args){
		Triangle t= new Triangle(5,9);
		t.setBorderWidth(2);
		t.setColor("Black");
		double a=t.area();
		System.out.println("Area of triangle = " +a);
		System.out.println("Color of triangle = " +t.getColor());
		System.out.println("BorderWidth of triangle = " +t.getBorderWidth());
	}

}
