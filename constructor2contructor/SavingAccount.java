package oop.constructor2contructor;

public class SavingAccount extends Account {
	private String branchName;
	public SavingAccount(){
		System.out.println("Default contructor=");
	}
	public SavingAccount(String n, String a,String at,String br){
		super(n,a,at);
		branchName=br;
		System.out.println("4 param contructor="+n+" "+a+" "+at+" "+br);
	}
	public static void main(String[]args){
		SavingAccount sa=new SavingAccount("XYZ","235788554233","Saving account","Rambag");
 	
 		
 		
 	
 		
 	}

}
