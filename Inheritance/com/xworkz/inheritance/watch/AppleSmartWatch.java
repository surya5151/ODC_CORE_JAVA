package com.xworkz.inheritance.watch;

public class AppleSmartWatch extends SmartWatch {

	public AppleSmartWatch() {
	this("S30");
		System.out.println("invoked no-org const form Apple Smart Watch");
	}
	
	public AppleSmartWatch(String model){
		this(3);
		System.out.println("invoked string const form AppleSmartWatch");
			
	}
	public AppleSmartWatch(int waranty) {
		super("M25",25);
		System.out.println("invoked int const form AppleSmartWatch");

	}
	
	
	
//		super("Apple-1");
//		System.out.println("invoked Apple Smartwatch const");
//	}
//	
//	  public AppleSmartWatch(String modle) {
//		super("Apple-2");
//		 System.out.println("invoked appleSmartWatch string parameter");
//		 
//	 }
}
