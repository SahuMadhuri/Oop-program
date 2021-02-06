package in.oop.setget;

public class Automobile {
	private String color="";
	private int speed=0;
	private String make="";
	public int $NO_OF_GEARS=0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int get$NO_OF_GEARS() {
		return $NO_OF_GEARS;
	}
	public void set$NO_OF_GEARS(int $no_OF_GEARS) {
		$NO_OF_GEARS = $no_OF_GEARS;
	}
	

}
