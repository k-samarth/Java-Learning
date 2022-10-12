package day6;

import java.util.LinkedHashSet;
import java.util.Set;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
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
