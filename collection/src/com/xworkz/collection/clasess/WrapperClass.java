package com.xworkz.collection.clasess;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WrapperClass {

	public static void main(String[] args) {

//		int age=10;
//		Integer integer = Integer.valueOf(age);
//		System.out.println(integer);
//		
//		int pritiveType = integer.intValue();
//		System.out.println(pritiveType);
		
		char x='A';
		
		Character character1 = Character.valueOf(x);
		System.out.println(character1);
		
		char charValue = character1.charValue();
		System.out.println(charValue);
		
		Integer character = Integer.valueOf(x);
		System.out.println(character);
		
		int primitiveType2 = character.intValue();
		System.out.println(primitiveType2);

		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1000);
		hashSet.add(3000);
		hashSet.add(2000);
		hashSet.add(5000);
		hashSet.add(4000);

		System.out.println(hashSet);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(hashSet);

		System.out.println(treeSet);

		String s = "bangaloreSSssss";

		TreeSet<Character> treeSet2 = new TreeSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			treeSet2.add(s.charAt(i));
		}
		System.out.println(treeSet2);

		Set<String> hashSet1 = new HashSet<String>();
		hashSet1.add("python");
		hashSet1.add("java");
		hashSet1.add("Angular");
		hashSet1.add("Html");
		hashSet1.add("Rube");
		hashSet1.add("java");
		hashSet1.add("Rube");
		System.out.println(hashSet1);

		TreeSet<String> treeSet3 = new TreeSet<String>(hashSet1);
		System.out.println(treeSet3);
		
		
		List<String> list = new ArrayList<String>();
		list.add("python");
		list.add("java");
		list.add("Angular");
		list.add("Html");
		list.add("Rube");
		list.add("java");
		list.add("Rube");
		
		System.out.println(list);
		
		TreeSet<String> treeSet4 = new TreeSet<String>(list);
		System.out.println(treeSet4);

	}

}
