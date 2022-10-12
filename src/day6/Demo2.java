package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import day4.ClassA;

public class Demo2 {

	public static void main(String[] args) {
		List<ClassA> employees;
		employees = new ArrayList<ClassA>();
		
		ClassA e1 = new ClassA(123,"Samarth",22,30000);
		ClassA e2 = new ClassA(124,"Reda",16,100000);
		ClassA e3 = new ClassA(125,"Meghana",85,3000);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(new ClassA(126,"Nireeksha",99,1));
		
		Iterator<ClassA> iter = employees.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
