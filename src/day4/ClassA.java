package day4;

public class ClassA {
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
	public ClassA(int id, String name, int age, int salary) {
		Id = id;
		Name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ClassA [Id=" + Id + ", Name=" + Name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("In 2022 the Employees of the company were: ");
		ClassA b1 = new ClassA(123,"Samarth",22,30000);
		ClassA b2 = new ClassA(124,"Reda",16,100000);
		ClassA b3 = new ClassA(125,"Meghana",85,3000);
		ClassA b4 = new ClassA(126,"Nireeksha",99,1);
		
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
