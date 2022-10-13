package day7;

import java.util.Comparator;

import day4.ClassA;

public class CompareAge implements Comparator<ClassA> {

	@Override
	public int compare(ClassA o1, ClassA o2) {
		if(o1.getAge() > o2.getAge())
			return 0;
		else
			return -1;
	}

}
