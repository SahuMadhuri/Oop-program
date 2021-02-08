package oop.constructor2contructor;

public class Account {
	private String name;
	private String accountno;
	private String accountType;
	private double balance;
	public Account(){
		System.out.println("Default contructor");
	}
	public Account(String n, String a){
		this();
		name=n;
		accountno=a;
		System.out.println("2 param contructor"+n+a);
		
	}
	public Account(String n, String a,String at){
		this(n,a);
		accountType=at;
		System.out.println("3 param contructor= "+n+" "+a+" "+at);
		
	}
	public static void main(String[]args){
		Account a=new Account("XYZ","235788554233","Saving account");
		
	}

}
