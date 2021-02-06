package in.oop.setget;

public class TestAccount {
	public static void main(String []args){
		Account a=new Account();
		a.setAccountType("saving account");
		a.setBalance(0);
		a.setNumber("769472849254");
		
		
		System.out.println("Account number a  = " +a.getAccountType());
		System.out.println("Balance a= "+a.getBalance());
		System.out.println("Number  a= "+a.getNumber());
		
		
	
	
	   Account b= new Account(); 
	 b.setAccountType("saving account");
	 b.setBalance(5000);
	 b.setNumber("75832928392");
	   
	   System.out.println("Account number b= "+b.getAccountType());
	   System.out.println("Balance b= "+b.getBalance());
	   System.out.println("Number b ="+b.getNumber());
	  
	
	   /*Account c=new Account();
	   c.setAccountType("Bill payment");
	   c.setBalance(0);
	   c.setNumber("8599939292");
	   transfer(100,a,c, 0);*/
	   
	   
	   TestAccount.deposit(500,a);
	   TestAccount.withdraw(100, a);
	   transfer(1000,a,b, b);
	   
	}
	

	public static void deposit(int depositAmount, Account a) {
		// Account a =new Account();
		double currentbalance=a.getBalance();
		a.setBalance(currentbalance+depositAmount);
		System.out.println("Amount deposited successfully!!!! a  "+a.getBalance());
		
		
	}
public static void withdraw(int withdrawAmount,Account a){
	double currentbalance=a.getBalance();
	a.setBalance(currentbalance-withdrawAmount);
	System.out.println("Amount withdraw successfully!!!!"+a.getBalance());
}
public static void transfer(double transferAmount,Account sender,Account receiver,Account a) {
	double senderBalance=sender.getBalance();
	double receiverBalance=receiver.getBalance();
	//double k=a.getBalance();
	 
	
	  if(transferAmount<senderBalance){
		sender.setBalance(senderBalance-transferAmount);
		System.out.println("sender current Balance = "+sender.getBalance());
		receiver.setBalance(receiverBalance+transferAmount);
		System.out.println("Receiver current Balance = "+receiver.getBalance());
		System.out.println("Amount Transfer Successfully");
	}else
	{
	System.out.println("fund cannot be transfer ");
	
    }
	
	

}
}
