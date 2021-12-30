package com.xworkz.collection.clasess;

import java.lang.reflect.Array;
import java.util.Iterator;

public class Tester {

	public static void main(String[] args) {
		String name = "surya";
		boolean ismaried = true;
		int age=29;
		
		Object[] array=new Object[10];
		array[0]=name;
		array[1]=ismaried;
		array[2]=age;
		array[3]=new Book();
		array[4]=new Software();
		
		System.out.println(array.hashCode());
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		 

	}

}
