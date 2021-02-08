package in.oop.inheritence;

public class Triangle extends Shape {
	
	 
	private int height;
	public int getHeight(){
		return getHeight();
	}
     public void setHeight(int height){
    	 this.height= height;
     }
     private int base;
	public int getBase() {
		return getBase();
	}

	public void setBase(int base) {
		this.base = base;
	}
	public double Area() {
		double d= 0.5*base*height;
		return d;
		
	}
	public static void main(String[] args){
		Triangle t= new Triangle();
		t.setBase(12);
		t.setHeight(10);
		t.setBorderWidth(56);
		t.setColor("Black");
		double s= t.Area();
		System.out.println("Area of Rectangle = "+s);
		System.out.println("BorderWidth of Rectangle ="+t.getBorderWidth());
		System.out.println("Color of Rectangle ="+t.getColor());
	}
	}




