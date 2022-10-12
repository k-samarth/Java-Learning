package day2;

class Employee{
	static int empId = 90;
	String empName;
	public Employee() {
		System.out.println("No Parameter Constructor");
		empId++;
		empName="Samarth";
	}
	
	public Employee(int number) {
		this();
		System.out.println("Int Parameter Constructor");
		empId = number;
	}

	public Employee(String empName) {
		this();
		System.out.println("String Parameter Constructor");
		this.empName = empName;
	}

	public Employee(int empId, String empName) {
		this();
		System.out.println("All Parameter Constructor");
		this.empId = empId;
		this.empName = empName;
	}

	public void display()
	{
		System.out.println("Employee Id: "+empId+" Name: "+empName);
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		
		Employee Samarth = new Employee();
		System.out.println("Samarth: ");
		Samarth.display();
		System.out.println();
		
		Employee Reda = new Employee(123);
		System.out.println("Reda: ");
		Reda.display();
		System.out.println();
		
		Employee Meghana = new Employee("Meghana");
		System.out.println("Meghana: ");
		Meghana.display();
		System.out.println();
		
		Employee Nireeksha = new Employee(125,"Nireeksha");
		System.out.println("Nireeksha: ");
		Nireeksha.display();
	}

}
