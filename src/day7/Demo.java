package day7;

interface Radio {
	void scan();
}

abstract class Animal {
	public Animal() {
		System.out.println("Animal cons called");
	}

	public abstract void eat();

	public abstract void drink();

	public void sleep() {
		System.out.println("Animnal sleeps");
	}
}

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Animal a = new Animal()
		{
			@Override
			public void eat() {
				System.out.println("MEN EATS");

			}

			@Override
			public void drink() {
				System.out.println("MEN DRINKS");
			}
		};

		a.eat();
		a.drink();

		Radio r = new Radio() {
			@Override
			public void scan() {
				System.out.println("Radio scanned");

			}
		};
		r.scan();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("RUN CALLED BY :" + Thread.currentThread().getName());

			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		System.out.println("MAIN CALLED BY :" + Thread.currentThread().getName());

	}
}
