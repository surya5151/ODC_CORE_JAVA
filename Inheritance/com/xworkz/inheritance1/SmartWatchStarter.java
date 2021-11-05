package com.xworkz.inheritance1;

import com.xworkz.inheritance.watch.AppleSmartWatch;
import com.xworkz.inheritance.watch.SmartWatch;

public class SmartWatchStarter {

	public static void main(String[] args) {

		AppleSmartWatch appleSmartWatch = new AppleSmartWatch();

		System.out.println(appleSmartWatch.width);
		System.out.println(appleSmartWatch.model);
		
		AppleSmartWatch appleSmartWatch2= new AppleSmartWatch(10);
		

		// AppleSmartWatch appleSmartWatch2=new AppleSmartWatch("S35");

		// SmartWatch smartWatch = new AppleSmartWatch();

		// SmartWatch smartWatch2=new SmartWatch("S45");

		// AppleSmartWatch appleSmartWatch2 = new SmartWatch(); // this type is not possible,

	}

}
