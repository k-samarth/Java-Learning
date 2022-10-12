package day6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		System.out.println(names.isEmpty());
		names.add("Samarth");
		names.add("Reda");
		
		System.out.println(names);
		
//		names.add(20);
//		names.add(3.1417);
//		names.add(null);
			
		System.out.println(names);
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp);
		}
	}

}
