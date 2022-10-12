package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		List names = new LinkedList();
		System.out.println(names.isEmpty());
		names.add("Samarth");
		names.add("Reda");
		
		System.out.println(names);
		
		names.add(20);
		names.add(3.1417);
//		names.add(null);
		
		System.out.println(names);
		
		names.add(1, "Kamath");
		System.out.println(names);
		
		List names1 = names;
		System.out.println(names1.containsAll(names));
		
		System.out.println(names);	
	}

}
