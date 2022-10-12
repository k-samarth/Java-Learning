import innerpackage.innerPerson;

public class Welcome {
	int num =10;
	
	public void accept()
	{
		System.out.println("Accept Called");
	}
	public void display()
	{
		accept();
		System.out.println("Display Called");
	}
	public static void main(String[] args) {
		System.out.println("I am Samarth Kamath");
		Welcome w = new Welcome();
		w.display();
		Bye b = new Bye();
		b.hello();
	}
}

class Bye
{
	public void hello()
	{
		System.out.println("Bye Hello Called");
	}
	public static void main(String[] args) {
		System.out.println("Bye main called");
		Welcome w = new Welcome();
		String names[] = {"sdssd","dffdfs"};
		w.main(names);
		innerPerson ip = new innerPerson();
		ip.display();
	}
}