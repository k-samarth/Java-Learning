package day3;

public abstract class Animals {
	String picture = "🐯";
	String food;
	String hunger;
	String boundaries;
	String location;
	
	public abstract void makeNoise();
	public abstract void eat();
	public abstract void roam();
	public void sleep()
	{
		System.out.println("💤💤💤");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to our Zoo:");
		System.out.println();
		System.out.println("Let's Meet our Lion: ");
		Lion lion = new Lion();
		lion.makeNoise();
		lion.eat();
		lion.sleep();
		lion.roam();
		
		System.out.println();
		System.out.println("Let's Meet our Tiger: ");
		Tiger tiger = new Tiger();
		tiger.makeNoise();
		tiger.eat();
		tiger.sleep();
		tiger.roam();
		
		System.out.println();
		System.out.println("Let's Meet our Cat: ");
		Cat cat = new Cat();
		cat.makeNoise();
		cat.eat();
		cat.sleep();
		cat.roam();
		
		System.out.println();
		System.out.println("Let's Meet our Dog: ");
		Dogs dog = new Dogs();
		dog.makeNoise();
		dog.eat();
		dog.sleep();
		dog.roam();
		
		System.out.println();
		System.out.println("Let's Meet our Wolf: ");
		Wolf wolf = new Wolf();
		wolf.makeNoise();
		wolf.eat();
		wolf.sleep();
		wolf.roam();
	}
}

abstract class Feline extends Animals{
	@Override
	public void roam() {
		System.out.println("Feline Roaming: 🐅");
	}
}

abstract class Canine extends Animals{
	@Override
	public void roam() {
		System.out.println("Canine Roaming: 🐺");
	}
}

class Lion extends Feline{
	public void makeNoise() {
		System.out.println("🦁 is Roaring");
	}

	@Override
	public void eat() {
		System.out.println("🦁 is Eating");
	}
}

class Tiger extends Feline{
	public void makeNoise() {
		System.out.println("🐯 is Roaring");
	}

	@Override
	public void eat() {
		System.out.println("🐯 is Eating");
	}
}

class Cat extends Feline{
	public void makeNoise() {
		System.out.println("🐱 says Meow");
	}

	@Override
	public void eat() {
		System.out.println("😽 is Eating");
	}
}

class Dogs extends Canine{
	public void makeNoise() {
		System.out.println("🐶 says Bow");
	}

	@Override
	public void eat() {
		System.out.println("🐩 is Eating");
	}
}

class Wolf extends Canine{
	public void makeNoise() {
		System.out.println("🐺 is Houling");
	}

	@Override
	public void eat() {
		System.out.println("🐺 is Eating");
	}
}

abstract class Hippo extends Animals{
	@Override
	public void makeNoise() {
		System.out.println("🦛 is grunting");
	}
	
	@Override
	public void eat() {
		System.out.println("🦛 is eating");
	}
}