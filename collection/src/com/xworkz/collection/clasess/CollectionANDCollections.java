package com.xworkz.collection.clasess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionANDCollections {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1000);
		list.add(5000);
		list.add(3000);
		list.add(2000);
		list.add(6000);
		list.add(6000);
		
		System.out.println(list);
		
		// method-1 (how sort list and set in sorted order)
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
		System.out.println(treeSet);
		
		// Method-2(how sort list and set in sorted order)
		
		System.out.println("Before sort"+list);
		Collections.sort(list);// Collections is a class..
		System.out.println("After sort assending"+list);
		
		Collections.reverse(list);
		System.out.println("After sort desending"+list);


		HashSet<Integer> set = new HashSet<Integer>();
		set.add(500);
		set.add(400);
		set.add(200);
		set.add(300);
		set.add(500);
		
		System.out.println(set);
	//	Collections.sort(set);// Collections not working in set interface.. go for treeSet

		TreeSet<Integer> treeSet2 = new TreeSet<Integer>(set);
		System.out.println(treeSet2);
		
		
	}

}
