package day3;

class Animal{
	public void Eat()
	{
		System.out.println("Animals are eating 👅");
	}
}
class Dog extends Animal{
	@Override
	public void Eat() {
		super.Eat();
		System.out.println("Dog is Eating 🐕");
	}
}
class Human extends Animal{
	@Override
	public void Eat() {
		System.out.println("Humans are eating 🍟");
	}
}
public class Inherit {
	public static void main(String[] args) {
		Dog D = new Dog();
		D.Eat();
		Human H = new Human();
		H.Eat();
	}
}
