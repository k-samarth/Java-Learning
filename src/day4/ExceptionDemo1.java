package day4;


import java.util.Scanner;


public class ExceptionDemo1 {

	int num1,num2,result;
	Scanner scanner = new Scanner(System.in);
	
	
	public void display() {
		System.out.println("Enter first number : ");
		num1  = scanner.nextInt();
		System.out.println("Enter second number : "); 
		num2  = scanner.nextInt();
	
		
		
			try {
				result = num1 /num2;
			}catch (Exception e) {
				System.out.println("Sahi Input Dena Chutiye");
			}
		
		
		System.out.println("The result is :"+result);
	}
	public static void main(String[] args) {
		System.out.println("Welcome ");
		ExceptionDemo1 demo1 = new ExceptionDemo1();
		demo1.display();
		
		System.out.println("Thanks for using my program");
	}
}

