package in.oop.overloading;

public class Triangle extends Shape {
	public double area(int height,int base){
		double d=0.5*height*base;
		System.out.println("area of Triangle(int,int) = "+d);
		return d;
	}
	public double area(int height,double base){
		double d=0.5*height*base;
		System.out.println("area of Triangle(int,double) = "+d);
		return d;
	}
	public double area(double height,int base){
		double d=0.5*height*base;
		System.out.println("area of Triangle(double,int) = "+d);
		return d;
	}
	public double area(double height,double base){
		double d=0.5*height*base;
		System.out.println("area of Triangle(double,double) = "+d);
		return d;
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.area(5, 6);
		t.area(6.7, 4);
		t.area(6, 0.5);
		t.area(6.5, 7.5);
		
	}

}
