package com.xworkz.inheritance.watch;

public class SmartWatch {

	public int width;
	public  String model;

	public SmartWatch() {
		System.out.println("invoked no-org const form smartwatch");

	}
	
	public SmartWatch(int width) {
		this.width=width;
		System.out.println("invoked int const from smartwatch !!!");
	}
	
	public SmartWatch(String model, int width) {
		this.model=model;
		this.width=width;
		System.out.println("invoked string,int const from smartWatch....");
		
	}

//	public SmartWatch(String brand){
//		System.out.println("invoked Smart Watch no-org const");
//		System.out.println(brand);
//	}

}
