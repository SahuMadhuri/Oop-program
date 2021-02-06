package in.oop.setget;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson {
	Date d=new Date();
	public static SimpleDateFormat sdf=new SimpleDateFormat ("dd/MM/yyyy");
	String strDate=sdf.format("04/05/2000");
	public static void main(String[]args)throws ParseException
	{
		Person P= new Person();
		P.setName("XYZ");
		P.setAddress("Sheetal nagar");
		P.set$AVG_AGE(22);
		P.setDob(sdf.parse("04/05/2000"));
		P.getName();
		P.getAddress();
		P.get$AVG_AGE();
		P.getDob();
		System.out.println(P.getName());
		System.out.println(P.getAddress());
		System.out.println(P.get$AVG_AGE());
		System.out.println(P.getDob());
		
	}
}


