package pack2;

import pack1.A;

public class E extends A{
	public void display() {
		System.out.println(i);
		A a = new A();
		System.out.println(a.i); //This will give error for protected because the object creation implies that it is not a child nor from the same package
	}
}
