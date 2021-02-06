package in.oop.setget;

import java.util.Date;

public class Person {
	private String name="";
	private String address="";
	public  static int $AVG_AGE=60;
	private Date dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int get$AVG_AGE() {
		return $AVG_AGE;
	}
	public void set$AVG_AGE(int $avg_AGE) {
		$AVG_AGE = $avg_AGE;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	

}
