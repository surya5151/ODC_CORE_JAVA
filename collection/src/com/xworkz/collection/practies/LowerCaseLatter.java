package com.xworkz.collection.practies;

import java.util.ArrayList;

public class LowerCaseLatter {
	
	
	public static void main(String[] args) {
		
		String s ="Hi Surya, How are you What You Do. 389489 93099";
		
		
		System.out.println(s.replaceAll("[A-Z]", "")); // Remove" upper case latter
		
		System.out.println(s.replaceAll("[a-z]", "")); // Remove upper case latter
		
		System.out.println(s.replaceAll("[5-9]", " ")); //Removing Numaric Number
		
		System.out.println(s.replaceFirst("Surya" , "Bharathi"));
		
		System.out.println(s.replace("Hi", "Too"));
		System.out.println(s.charAt(12));
		System.out.println(s.codePointAt(12));
		System.out.println(s.codePointBefore(13));
		System.out.println(s.codePointCount(1,5));
		System.out.println(s.compareTo("Hi"));
		System.out.println(s.toString());
		System.out.println(s.concat(" flag"));
		System.out.println(s.contains("Surya"));

	}

}
