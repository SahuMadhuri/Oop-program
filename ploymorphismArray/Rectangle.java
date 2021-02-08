package in.oop.ploymorphismArray;



public class Rectangle extends Shape {
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double Area(){
		double d= length*width;
		return d;
		
	}
	public static void main(String []args){
		Shape s[]=new Shape[3];
		Rectangle r=new Rectangle();
		s[0]=new Rectangle();
		r.setLength(17);
		r.setWidth(10);
		r.setBorderWidth(56);
		r.setColor("purple");
		double d= r.Area();
		System.out.println(d);
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		
		
	

}
}