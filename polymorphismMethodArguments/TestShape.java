package in.oop.polymorphismMethodArguments;

public class TestShape extends Shape {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		double totalArea = calcArea(s);
		System.out.println("total Area= "+totalArea);
	}

	public static double calcArea(Shape[] s) {
		double totalArea = 0;
		System.out.println("Area of Rectangle= "+s[0].area());
		System.out.println("Area of Circle= "+s[1].area());
		System.out.println("Area of Triangle= "+s[2].area());
		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}

	public static Shape getShape(int i) {
		if (i == 1)
			return new Rectangle();
		if (i == 2)
			return new Circle();
		if (1 == 3)
			return new Triangle();
		return null;
	}

}
