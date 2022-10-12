package day6;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		System.out.println(names.isEmpty());
		names.add("Samarth");
		names.add("Reda");
		
		System.out.println(names);
		
		names.add(20);
		names.add(3.1417);
//		names.add(null);
			
		System.out.println(names);	
	}

}
