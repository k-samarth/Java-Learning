package day5;

public class ExceptionDemo {

	int num1,num2,num3;
	
	String name;
	
	public void display1() throws InterruptedException
	{
		System.out.print("Meghana is a B");
		Thread.sleep(5000);
		System.out.println("anglorean");
	}
	public void display2() throws InterruptedException
	{
		System.out.print("Samarth is a M");
		Thread.sleep(5000);
		System.out.println("anglorean");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		ExceptionDemo d = new ExceptionDemo();
		try {
			d.display1();
			d.display2();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Okay Tata Bye Bye See You!!");
	}
}
