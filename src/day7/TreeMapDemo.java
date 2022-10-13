package day7;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> employees = new TreeMap<String, Integer>();
		employees.put("Reda", 40000);
		employees.put("Samarth", 30000);
		employees.put("Nireeksha", 20000);
		employees.put("Meghana", 10000);
		
		System.out.println("Salary of Samarth is : "+employees.get("Samarth"));
		System.out.println("Details of Employees are:"+employees);
	}
}
