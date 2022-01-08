package com.xworkz.collection.clasess;

import java.util.Objects;
import java.util.TreeSet;

public class SoftwareWrapperClass implements Comparable<SoftwareWrapperClass> {

	private String name;

	private Double price;

	private String version;

	private Boolean isanAutoSave;

	private Boolean isanInternetApp;

	public SoftwareWrapperClass() {
		System.out.println(this.getClass().getSimpleName() + "invoked no- org constructor...");
	}

	@Override
	public int hashCode() {
		return Objects.hash(isanAutoSave, isanInternetApp, name, price, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareWrapperClass other = (SoftwareWrapperClass) obj;
		return Objects.equals(isanAutoSave, other.isanAutoSave)
				&& Objects.equals(isanInternetApp, other.isanInternetApp) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(version, other.version);
	}

	public SoftwareWrapperClass(String name, Double price, String version, Boolean isanAutoSave,
			Boolean isanInternetApp) {
		super();
		this.name = name;
		this.price = price;
		this.version = version;
		this.isanAutoSave = isanAutoSave;
		this.isanInternetApp = isanInternetApp;
	}

	@Override
	public String toString() {
		return "SoftwareWrapperClass [name=" + name + ", price=" + price + ", version=" + version + ", isanAutoSave="
				+ isanAutoSave + ", isanInternetApp=" + isanInternetApp + "]";
	}

	// Comparable method
	@Override
	public int compareTo(SoftwareWrapperClass obj) {
		System.out.println("invoked compareTo()");

		int value = this.price.compareTo(obj.price);
		if (value > 0) {

			return 100;//swap the element
		}
		if (value < 0) {

			return -100;//not swap the element
		}
		if (value == 0) {

			return 0;// remove the duplicate element
		}

		return 0;
	}

	
	///////////////////////////////////////////////////////////////////
	
	
	public static void main(String[] args) {

//		TreeSet<Character> treeSet2 = new TreeSet<Character>();
//		treeSet2.add('Z');
//		treeSet2.add('A'); //"A" compareTo("Z")
//		
//		System.out.println(treeSet2);
//		
//		System.out.println("Z".compareTo("A"));
//		System.out.println("A".compareTo("Z"));
//		System.out.println("A".compareTo("A"));
//		
//		Integer element1 = new Integer(10);
//		Integer element2 = new Integer(20);
//		
//		System.out.println(element1.compareTo(element2));
//		System.out.println(element2.compareTo(element1));

		SoftwareWrapperClass softwareWrapperClass1 = new SoftwareWrapperClass("java", 25000.00, "1.8version", true,
				false);
		SoftwareWrapperClass softwareWrapperClass2 = new SoftwareWrapperClass("pythone", 35000.00, "1.9version", true,
				false);
		SoftwareWrapperClass softwareWrapperClass3 = new SoftwareWrapperClass("facebook", 5000.00, "5.0version", false,
				true);
		SoftwareWrapperClass softwareWrapperClass4 = new SoftwareWrapperClass("twinter", 8000.00, "4.0version", false,
				true);
		SoftwareWrapperClass softwareWrapperClass5 = new SoftwareWrapperClass("Rubee", 10000.00, "2.7version", true,
				false);
		SoftwareWrapperClass softwareWrapperClass6 = new SoftwareWrapperClass("Rubee", 10000.00, "2.7version", true,
				false);

		TreeSet<SoftwareWrapperClass> treeSet = new TreeSet<SoftwareWrapperClass>();

		treeSet.add(softwareWrapperClass1);
		treeSet.add(softwareWrapperClass2);
		treeSet.add(softwareWrapperClass3);
		treeSet.add(softwareWrapperClass4);
		treeSet.add(softwareWrapperClass5);

		System.out.println(treeSet);
		
		//shorted set have 6-method.........
//		treeSet.first();
//		treeSet.last();
//		treeSet.headSet(softwareWrapperClass6);
//		treeSet.tailSet(softwareWrapperClass6);
//		treeSet.subSet(softwareWrapperClass5, softwareWrapperClass6);
//		treeSet.comparator();
		
		System.out.println(".......................");
//		System.out.println(treeSet.first());
//		System.out.println(treeSet.last());
//		System.out.println(treeSet.headSet(softwareWrapperClass1));
//		System.out.println("...");
		System.out.println(treeSet.tailSet(softwareWrapperClass1));
//		System.out.println(treeSet.subSet(softwareWrapperClass3, softwareWrapperClass1));
		
		
		
		
	}

}
