package day7;

class Payment{
	static Payment p1;
	
	private Payment() {
		System.out.println("Object Created");
	}
	
	public static Payment getPaymentInstance() {
		if(p1==null)
		{
			p1= new Payment();
		}
		return p1;
	}
	
	public void deposit(int amount)
	{
		System.out.println(amount+" has been Deposited");
	}
}

public class Singleton {
	
	
	public static void main(String[] args) {
		
		Payment sam = Payment.getPaymentInstance();
		sam.deposit(10000);
		
		Payment megh = Payment.getPaymentInstance();
		megh.deposit(20000);
		
		Payment niri = Payment.getPaymentInstance();
		niri.deposit(30000);
	}

}
