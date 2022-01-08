package com.xworkz.mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {

		String name = "hassan";

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] charArray = name.toCharArray();
		for (char latter : charArray) {
			if (map.containsKey(latter)) {
				Integer value = map.get(latter);
				value++;
				map.put(latter, value);
			} else {
				map.put(latter, 1);
			}
		}
		// System.out.println(map);

		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			// System.out.println("keys: " +character);
		}

		Collection<Integer> collection = map.values();
		for (Integer integer : collection) {
			// System.out.println("Values : " +integer);
		}

		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			System.out.println("Entry :" + entry);
		}
		System.out.println();
		Set<Character> keySet2 = map.keySet();
		TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>(map);
		Set<Entry<Character, Integer>> entrySet = treeMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
