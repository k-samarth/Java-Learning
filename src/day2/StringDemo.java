package day2;

public class StringDemo {

	public static void main(String[] args) {
		String name1 = "Sam";
		name1 = "Samarth";
		
		System.out.println("String Concat: ");
		System.out.println(name1.concat(" Kamath"));
		System.out.println();
		
		System.out.println("After String Concat: ");
		System.out.println(name1);
		System.out.println();
		
//		== vs equals
		String name2 = "Samarth";
		System.out.println(" name1 == name2 :");
		System.out.println(name1==name2);
		System.out.println(" name1.equals(name2) :");
		System.out.println(name1.equals(name2));
		System.out.println();
		
		System.out.println("String creation with new keyword: ");
		String name3 = new String("Samarth");
		System.out.println(" name1 == name3 :");
		System.out.println(name1==name3);
		System.out.println(" name1.equals(name3) :");
		System.out.println(name1.equals(name3));
		System.out.println();
		
//		StringBuffer
		System.out.println("String Buffer: ");
		StringBuffer name4 = new StringBuffer("Samarth");
		name4.append(" Kamath");
		System.out.println(name4);
		System.out.println();
		
//		StringBuilder
		System.out.println("String Builder");
		StringBuilder name5 = new StringBuilder("Samarth");
		name5.append(" Kamath");
		System.out.println(name5);
	}

}
