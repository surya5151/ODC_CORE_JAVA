package com.xworkz.abstraction;

public abstract class TravelPlane {

	private String destination;

	public TravelPlane(String destination) {
		this.destination = destination;
	}

	public TravelPlane() {

	}

	public abstract boolean travelToGoa(int totalPeopele, double budget);

	public abstract void travelToAmerica();

}
