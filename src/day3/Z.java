package day3;

public class Z {
	static int number = 0;
	
	{
		System.out.println(++number+". Z ka instance hoon me");
	}
	static {
		System.out.println(++number+". Z me static hoon me");
	}
	public Z()
	{
		System.out.println(++number+". Z me Constructor hoon me");
	}
	W w = new W();
	public static void main(String[] args) {
		System.out.println(++number+". Me toh Z ka baap hoon");
		new Z();
		new Z();
	}
}
