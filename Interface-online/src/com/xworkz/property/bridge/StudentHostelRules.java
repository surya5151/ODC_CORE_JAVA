package com.xworkz.property.bridge;

public class StudentHostelRules implements HostelRules {

	@Override
	public boolean admission() {
		System.out.println("invoked admission");
		return false;
	}

	@Override
	public double closeTime() {
		System.out.println("invoked closeTime");
		return 5000;
	}

	@Override
	public String gender() {
	System.out.println("invoked gender");
		return null;
	}

}
