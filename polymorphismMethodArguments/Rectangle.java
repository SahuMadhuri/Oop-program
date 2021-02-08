package in.oop.polymorphismMethodArguments;


public class Rectangle extends Shape {

	 int width=10;
	 int length=15;
	
	public double area(){
		double d= length*width;
		return d;
	}
	public static void main(String []args){
		Rectangle r =new Rectangle();
		//r.setLength(15);
		//r.setWidth(10);
		//r.setBsorderWidth(56);
		//r.setColor("purple");
		double d= r.area();
		System.out.println(d);
		//System.out.println(d);
		//System.out.println(r.getBorderWidth());
		//System.out.println(r.getColor());
	}
		

	}


