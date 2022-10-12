
public class VariableScope {
	int i=10; //instance Scope
	static int j=20; // class scope
	
	{
		int k=0; //Block scope
	}
	
	public void increment() {
		i++;
		j++;
	}
	
	public static void displayStatic()
	{
//		System.out.println(i); //Not allowed bcz static methods need static variables only
		System.out.println(j);
	}
	
	public void display()
	{
		int k=0; //local scope
		System.out.println("i: "+i);
		System.out.println("j: "+j);
	}
	
	public static void main(String[] args) {
		VariableScope v1 = new VariableScope();
		System.out.println("V1 before: ");
		v1.display();
		v1.increment();
		System.out.println("V1 after: ");
		v1.display();
		System.out.println();
		
		VariableScope v2 = new VariableScope();
		System.out.println("V2 before: ");
		v2.display();
		v2.increment();
		System.out.println("V2 after: ");
		v2.display();
		System.out.println();
		
		System.out.println("Different ways to access static j: ");
		System.out.print("Direct j: ");
		System.out.println(j);
		System.out.println("Using objects: ");
		System.out.print("V1: ");
		System.out.println(v1.j);
		System.out.print("V2: ");
		System.out.println(v2.j);
		System.out.print("Using Class: ");
		System.out.println(VariableScope.j);
		System.out.println();
		
		System.out.println("Static function call: ");
		displayStatic();
	}
}
