package day7;

import java.util.Comparator;

import day4.ClassA;

public class CompareName implements Comparator<ClassA> {

	@Override
	public int compare(ClassA o1, ClassA o2) {
		if(o1.getName().compareTo(o2.getName())>0)
			return 0;
		else
			return -1;
	}

}
