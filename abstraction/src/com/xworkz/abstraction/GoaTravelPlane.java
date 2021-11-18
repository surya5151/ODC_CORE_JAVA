package com.xworkz.abstraction;

public  class GoaTravelPlane extends TravelPlane {

	public GoaTravelPlane() {
		super("GOA");

	}

	@Override
	public boolean travelToGoa(int totalPeopele, double budget) {

		System.out.println("travel to Goa");
		System.out.println("total people " + totalPeopele);
		System.out.println("Budgate " + budget);
		return false;

	}

	@Override 
	public void travelToAmerica() {

		System.out.println("travel to America");
	}

}
