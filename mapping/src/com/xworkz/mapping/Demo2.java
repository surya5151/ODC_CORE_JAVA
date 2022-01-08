package com.xworkz.mapping;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {

		String name = "hassan mysore bangalore mysore ";

		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] split = name.split(" ");

		for (String word : split) {
			if (map.containsKey(word)) {
				Integer value = map.get(word);
				value++;
				map.put(word, value);

			} else {
				map.put(word, 1);
			}
			// System.out.println(word);
		}
		System.out.println(map);

	}

}
