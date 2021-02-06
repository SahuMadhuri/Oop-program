package in.oop.setget;

public class TestAutomobile {
	public static void main(String []args){
	
	Automobile a= new Automobile();
	a.setColor("Green");
	a.setSpeed(50);
	a.setMake("Auto parts");
	a.set$NO_OF_GEARS(4);
	a.getColor();
	a.getSpeed();
	a.getMake();
	a.get$NO_OF_GEARS();
	System.out.println(a.getColor());
	System.out.println(a.getSpeed());
	System.out.println(a.getMake());
	System.out.println(a.get$NO_OF_GEARS());
	
	
	
	}
}
