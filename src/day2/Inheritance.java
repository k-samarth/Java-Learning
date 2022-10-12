package day2;

class Vehicle{
	int price=1000;
	public void start()
	{
		System.out.println("Wrooom... Wrooom...");
	}
	public void stop()
	{
		System.out.println("Creeeeeeekkkkk....");
	}
	public void display() {
		System.out.println("In Super Class: ");
		System.out.println(price);
		System.out.println();
	}
}

class Car extends Vehicle{
	int price = 2000;
	public void onAC()
	{
		System.out.println("Fussssssssss...");
	}
	public void display() {
		System.out.println("In Chid Class: ");
		System.out.println("Local: ");
		System.out.println(price);
		System.out.println("This Instance: ");
		System.out.println(this.price);
		System.out.println("From SuperClass: ");
		System.out.println(super.price);
		System.out.println();
		super.display();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.onAC();
		c.display();
		c.stop();
	}

}
