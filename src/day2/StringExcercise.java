package day2;

public class StringExcercise {
	
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println("1.	Print the character at the 12th index:" + str.charAt(12));
		System.out.println();
		
		System.out.println("2.	Check whether the String contains the word “is”: " + str.contains("is"));
		System.out.println();
		
		System.out.println("3.	Add the string “and killed it” to the existing string: "+ str.concat(" and killed it"));
		System.out.println();
		
		System.out.println("4.	Check whether the String ends with the word “dogs”: "+str.endsWith("dogs"));
		System.out.println();
		
		System.out.println("5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”."+str.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println();
		
		System.out.println("6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”: "+str.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println();
		
		System.out.println("7.	Find the length of the String. : "+str.length());
		System.out.println();
		
		System.out.println("8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. :"+str.matches("The quick brown Fox jumps over the lazy Dog"));
		System.out.println();
		
		System.out.println("9.	Replace the word “The” with the word “A”: "+str.replace("The", "A"));
		System.out.println();
		
		String[] strs = str.split("fox");
		strs[0]=strs[0].concat("fox");
		System.out.println("10.	Split the above string into two such that two animal names do not come together. :");
		for(String a : strs)
		{
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("11.	Print the animal names alone separately from the above string.: ");
		String[] animals = {"fox","dog","cat","horse","lion"};
		String[] words = str.split(" ");
		for(String i:words)
		{
//			System.out.println("in for 1");
			for(String j:animals)
			{
//				System.out.println("in for 2");
				if(i.equals(j))
				{
//					System.out.println("in if");
					System.out.println(i);
				}
			}
		}
		System.out.println();
		
		System.out.println("12.	Print the above string in completely lower case. :" + str.toLowerCase());
		System.out.println();
		
		System.out.println("13.	Print the above string in completely upper case.: "+str.toUpperCase());
		System.out.println();
		
		System.out.println("14.	Find the index position of the character “a”.: "+str.indexOf("a"));
		System.out.println();
		
		System.out.println("15.	Find the last index position of the character “e”.: "+str.lastIndexOf("e"));
		System.out.println();
		
	}
}
