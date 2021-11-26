package com.xworkz.rainbow;

public interface Rainbow {

	public static final int TOTAL_COLOR = 7; // public static final is there by defult

	// public
	void displayColor();

	// defult
	default String getFirstColor() {
		System.out.println("invoked defult implementation..");
		return "NA";
	}

	static void displayTotalColor() {
		System.out.println("total color=7");
	}

}
