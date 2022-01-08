package com.xworkz.mapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "ramu");
		map.put(200, "shamu");
		map.put(200, "bamu");
		map.put(300, "ramu");
		System.out.println(map);

		Map<Mobile, String> map2 = new HashMap<Mobile, String>();

		map2.put(new Mobile("Samsung", 30000), "android");
		map2.put(new Mobile("Sony", 50000), "android");
		map2.put(new Mobile("Sony", 50000), "android");
		map2.put(new Mobile("Sony", 50000), "android");

		System.out.println(map2);

		Set<Mobile> set = new HashSet<Mobile>();
		set.add(new Mobile("Sony", 50000));
		set.add(new Mobile("Sony", 50000));
		set.add(new Mobile("Sony", 50000));

		System.out.println(set);

	}

}
