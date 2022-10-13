package day7;

import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.Comparator;

import day4.ClassA;
public class Demo2 {

	public static void main(String[] args) {
		ClassA b1 = new ClassA(123,"Samarth",22,30000);
		ClassA b2 = new ClassA(124,"Reda",16,100000);
		ClassA b3 = new ClassA(125,"Meghana",85,3000);
		ClassA b4 = new ClassA(126,"Nireeksha",99,1);
		
		List<ClassA> employees = new Vector();
		employees.add(b1);
		employees.add(b2);
		employees.add(b3);
		employees.add(b4);
		
		System.out.println("Before Sorting: ");
		System.out.println(employees);
		
		Collections.sort(employees);
		
		System.out.println("After Sorting: ");
		System.out.println(employees);
		
		
		Collections.sort(employees,new CompareAge());
		System.out.println("Sort using Comparator on Age:");
		System.out.println(employees);
		
		Collections.sort(employees,new CompareName());
		System.out.println("Sort using Comparator on Name:");
		System.out.println(employees);
		
		Collections.sort(employees,new CompareId());
		System.out.println("Sort using Comparator on ID:");
		System.out.println(employees);
		
		Collections.sort(employees,new CompareSalary());
		System.out.println("Sort using Comparator on Salary:");
		System.out.println(employees);
		
		Comparator<ClassA> compareSalary = (o1,o2) -> {if(o1.getSalary()>o2.getSalary()) return 0; else return -1;};
		System.out.println("Sort using Lambda Function");
		System.out.println(employees);
	}

}
