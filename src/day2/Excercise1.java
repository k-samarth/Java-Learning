package day2;

import java.util.Scanner;

/*
 * Exercise: Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining. The total no of eggs can be got as input through console. The program should display how many gross, how many dozen, and how many left over eggs the user has. 
For example, if the input is 1342 eggs, then the program should respond with 
	  Your number of eggs is 9 gross, 3 dozen, and 10 

 */
public class Excercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Eggs");
		int n = sc.nextInt();
		
		int gross = n/144;
		n=n-(gross*144);
		int dozen = n/12;
		n=n-(dozen*12);
		System.out.println("Your number of Eggs is "+gross+" gross, "+dozen+" dozen, and "+n);
		
	}
}
