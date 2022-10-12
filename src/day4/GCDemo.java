package day4;

class Customer {
	 @Override
	protected void finalize() throws Throwable {
		System.out.println("FINALIZE CALLED - CUSTOMER");
	}
}
public class GCDemo {

	public static void main(String[] args) {
		System.out.println("Main Called");
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = c2;
		c3= null;
//		Customer c4 = c1;
		c1 = null;
		
		System.gc();
	}
}
