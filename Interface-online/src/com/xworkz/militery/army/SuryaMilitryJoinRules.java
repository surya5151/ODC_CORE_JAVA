package com.xworkz.militery.army;

public class SuryaMilitryJoinRules implements MilitryJoinRules {

	public SuryaMilitryJoinRules() {
		System.out.println("invoked no-arg");

	}

	@Override
	public double height() {
		System.out.println("invoked height");
		return 5.1;
	}

	@Override
	public int age() {
		System.out.println("invoked age");
		return 22;
	}

	@Override
	public String nationality() {
		System.out.println("invoked nationality");
		return "Indian";
	}

}
