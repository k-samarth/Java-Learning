package day4;

class ClassB{
	private int Id;
	private String Name;
	private int age;
	private int salary;
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}
	public ClassB(int id, String name, int age, int salary) {
		Id = id;
		Name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ClassB [Id=" + Id + ", Name=" + Name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
public class ClassA {
	public static void main(String[] args) {
		System.out.println("In 2022 the Employees of the company were: ");
		ClassB b1 = new ClassB(123,"Samarth",22,30000);
		ClassB b2 = new ClassB(124,"Reda",16,100000);
		ClassB b3 = new ClassB(125,"Meghana",85,3000);
		ClassB b4 = new ClassB(126,"Nireeksha",99,1);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println();
		
		System.out.println("In 2023 the Employees of the company were: ");
		b1.setAge(b1.getAge()+1);
		b2.setAge(b2.getAge()+1);
		b3.setAge(b3.getAge()+1);
		b4.setAge(b4.getAge()+1);
		
		b1.setSalary(b1.getSalary()+100);
		b2.setSalary(b2.getSalary()+100);
		b3.setSalary(b3.getSalary()+100);
		b4.setSalary(b4.getSalary()+100);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
	}
}
