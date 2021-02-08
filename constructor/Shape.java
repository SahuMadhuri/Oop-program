package in.core.constructor;


/**
 * @author Madhuri
 * 
 *
 */
public class Shape {
	private String color;
	private int borderWidth;
	public static final double p=3.14;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	
	public Shape(){
		System.out.println("This is default contructor ");
	}
	public Shape (String color, int bw){
		this.color=color;
		borderWidth=bw;
	}
	

}
