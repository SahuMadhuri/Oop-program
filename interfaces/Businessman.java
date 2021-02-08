package in.oop.interfaces;

public class Businessman implements Richman,SocialWorker{
	

	@Override
	public void helpToOthers() {
		System.out.println("help to other");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("party");
		
	}

	@Override
	public void party() {
		System.out.println("donation");
		
	}
	public static void main(String[]args){
		Businessman b=new Businessman();
		b.donation();
		b.earnMoney();
		b.helpToOthers();
		b.party();
	}
	
}
