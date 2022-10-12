package day2;

public class Overloading {
	public void add()
	{
		System.out.println("Enter Valid numbers to add");
	}
	public void add(int num1)
	{
		add();
	}
	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		Overloading a = new Overloading();
		a.add();
		a.add(1);
		a.add(123,234);
	}
}
