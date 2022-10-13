package day7;

interface MathOperation{
	int Operation(int a, int b);
}
public class MathCalculator {
	public static void main(String[] args) {
		MathOperation sum = (a,b) -> a+b;
		System.out.println(sum.Operation(10, 20));
		
		Runnable r = () -> {System.out.println("I am in Thread "+Thread.currentThread().getName());};
		Thread t1 = new Thread(r);
		t1.start();
	}
}
