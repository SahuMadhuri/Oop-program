package oop.constructor2contructor;

public class Employee extends Person{
	private String designation=null;
	
	public Employee(){
		System.out.println("Person Default Constructor");
	}
     public Employee(String fn,String ln,String add,String des){
    	 super(fn,ln);
    	 designation =des;
    	 System.out.println("3 param contructor is called"+firstName+" " +lastName+" "+address+designation);
     }
     public static void main(String[]args){
 		Person p=new Person("Madhuri","Sahu","Rays");
 	
 		
 		
 	
 		
 	}
 	
}
