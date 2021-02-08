package in.core.settergetter;

public class TestShape {
	public static void main(String[]args){
		Shape s =new Shape();
		s.setColor("Red");
		s.setBorderWidth(3);
		int i1=s.getBorderWidth();
		String s1= s.getcolor();
		System.out.println("BorderWidth= "+i1);
		System.out.println("Color= "+s1);
		
	}

}


