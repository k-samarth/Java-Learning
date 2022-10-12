package pack1;

import pack2.D;
import pack2.E;

public class A {
	public int i=10;
//	private int i=10;
//	int i=10;
//	protected int i=10;
	
	public void display() {
		System.out.println(i);
		A a=new A();
		System.out.println(a.i);
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.display();
		B b = new B();
		b.display();
		C c = new C();
		c.display();
		
		D d = new D();
		d.display();
		E e = new E();
		e.display();
		
	}
}
