package day3;

abstract class Vehicle{
	public abstract void start();
	public abstract void stop();
	public void displayPrice()
	{
		System.out.println("I paid $1,00,000 for my BMW");
	}
	public Vehicle()
	{
		System.out.println("Tera Baap Aya 😎");
	}
}

class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("My BMW is starting: Wroom... Wroom...");
	}
	@Override
	public void stop() {
		System.out.println("My BMW is stopping: Creek... Creek...");
	}
	
	public void onAC() {
		System.out.println("AC is getting On");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Car BMW = new Car();
		BMW.start();
		BMW.stop();
		BMW.displayPrice();
	}
}
