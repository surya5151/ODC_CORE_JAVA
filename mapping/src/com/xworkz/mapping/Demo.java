package com.xworkz.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("Magadi",10); // add key value pair entries
		map.put("Bangalore",20);
		map.put("Mysore",30);
		map.put("Hassan",40);
		map.put("Goa",40);
		map.put("Hassan",50);
		//System.out.println(map);
			
		HashMap<String,Demo> map1 = new HashMap<String, Demo>();

		Demo demo = new Demo();
		map1.put("Magadi",demo); 
		map1.put("Bangalore",new Demo());
		map1.put("Mysore",new Demo());
		map1.put("Hassan",new Demo());
		
//		System.out.println(map1);
//		System.out.println(map1.size());
//		System.out.println(map1.isEmpty());
//		System.out.println(map1.containsKey("Bangalore"));
//		System.out.println(map1.containsKey("surya"));
//		System.out.println(map1.containsValue("Mysore"));
//		System.out.println(map1.containsValue(new Demo()));
//		System.out.println(map1.containsValue(demo));
//		System.out.println(map1.get("Bangalore"));
//		System.out.println(map1.get("surya"));
		
//		System.out.println(map1.remove("Magadi", demo));
//		System.out.println(map1.remove("surya", demo));
//		System.out.println(map1);

		Collection<String> container1 = new ArrayList<String>();
		Collection<String> container2 = new ArrayList<String>();
		container2.addAll(container1);

		HashMap<String,Demo> map2 = new HashMap<String, Demo>();
		map2.put("Tamilnadu",new Demo());
		map2.put("Kerla",new Demo());
		
		map2.putAll(map1);
		//System.out.println(map2);
		
		Set<String> setOfStringObject = map.keySet();
		//System.out.println(setOfStringObject);
		
		Iterator<String> iterator = setOfStringObject.iterator();
		while(iterator.hasNext()) {
			String keySet = iterator.next();
		//	System.out.println("Keys : "+keySet); 
		}	
			Collection<Integer> values = map.values();
			//System.out.println(values);
			for (Integer integer : values) {
				//System.out.println(integer);				
			}
			
			Collection<Demo> values2 = map1.values();
			for (Demo demo2 : values2) {
				//System.out.println("Values : "+demo2);				
			}
	
			
			Set<Entry<String, Demo>> entrySet = map1.entrySet();
			//System.out.println(entrySet);
			for (Entry<String, Demo> entry : entrySet) {
				System.out.println("EntrySet: " +entry);
			}
		}
	
	}


