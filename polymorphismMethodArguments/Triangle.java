package in.oop.polymorphismMethodArguments;



public class Triangle extends Shape{
	/*private int height;
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
	}*/
	int base=10;
	int height=15;
	public double area() {
		double d= 0.5*base*height;
		return d;
		
	}
	public static void main(String[] args){
		Triangle t= new Triangle();
		/*t.setBase(12);
		t.setHeight(10);
		t.setBorderWidth(56);
		t.setColor("yellow");*/
		double s= t.area();
		System.out.println(s);
		//System.out.println(t.getBorderWidth());
		//System.out.println(t.getColor());
	}

}
