package in.oop.overloading;



public class Rectangle extends Shape {
	

	public int Area(int length,int width){
		
		int d= length*width;
		System.out.println("Area of Rectangle(int,int)= "+d);
		return d;

}
public double Area(double length,int width){
		
		double d= length*width;
		System.out.println("Area of Rectangle(double,int)= "+d);
		return d;

}
public double Area(int length,double width){
	
	double d= length*width;
	System.out.println("Area of Rectangle(int,double)= "+d);
	return d;

}
public double Area(double length,double width){
	
	double d= length*width;
	System.out.println("Area of Rectangle(double,double)= "+d);
	return d;

}



	public static void main(String [] args){
		Rectangle r =new Rectangle();
		r.Area(3,7);
		r.Area(5.2, 10);
		r.Area(7,5.2);
		r.Area(3.2,5.5 );
	}
}
