package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		System.out.println(names.isEmpty());
		names.add("Samarth");
		names.add("Reda");
		names.add("Meghana");
		names.add("Nireeksha");
		
		System.out.println(names);
		
//		names.add(20);
//		names.add(3.1417);
//		names.add(null);
		
		System.out.println(names);
		
		names.add(1, "Kamath");
		System.out.println(names);
		
		List names1 = names;
		System.out.println(names1.containsAll(names));
		
		System.out.println(names);	
		
		Collections.sort(names);
		System.out.println("After Sort");
		System.out.println(names);
		
		System.out.println("Samarth is found at : "+Collections.binarySearch(names,"Samarth"));
		
	}

}
