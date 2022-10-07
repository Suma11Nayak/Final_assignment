package oops;



class Banking{
	void B1() {
		System.out.println("Bank Details");
		
		
	}
}
class Withdrawal extends Banking{
	
	
	protected void w1() {
		System.out.println("Withdrawal Details");
	}
}
	

public class MultiInheritance extends Withdrawal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 MultiInheritance f1=new MultiInheritance();
 
 f1.B1();
 f1.w1();
 System.out.println("Transaction Details");

	}

}
