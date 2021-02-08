package oop.constructor2contructor;

public class Person {
	public  String firstName=null;
	public  String lastName=null;
     public String address=null;
	public Person(){
		System.out.println("Person Default Constructor");
	}
	public Person(String fn,String ln){
		
		firstName=fn;
		lastName=ln;
		System.out.println("2 params contructor is called= "+firstName+" " +lastName);
	}
	public Person(String fn,String ln,String add){
		this(fn,ln);
		address=add;
		System.out.println("3 params contructor is called= "+firstName+" " +lastName+" "+address);
		
	}
	
	public static void main(String[]args){
		Person p=new Person("Madhuri","Sahu","Indore");
	
		
		
	
		
	}
	

}
