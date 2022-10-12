package day5;

class A{
	String name;
	int price;
	int quantity;
	public A(String name, int price, int quantity) {
		super();
		this.name = name;
		if(price<0)
			throw new NegativePrice("Wrong Price Bro");
		this.price = price;
		if(quantity<0)
			throw new NegativeQOH("Wrong Quantity Bro");
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
public class Tester {
	
	public static void main(String[] args) {
		try {
			A a = new A("Parle-G",-10,-20);
			System.out.println(a);
		} catch (NegativePrice e) {
			System.out.println(e.getMessage());
		}
		catch(NegativeQOH e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Thanks for using this");
	}
	
}