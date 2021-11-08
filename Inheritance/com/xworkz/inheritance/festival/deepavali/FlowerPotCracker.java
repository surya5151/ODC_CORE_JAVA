package com.xworkz.inheritance.festival.deepavali;

public class FlowerPotCracker extends Cracker {

	public String name = "Lakshmi";

	public FlowerPotCracker() {
		super();
		System.out.println("invoked no-org cons from flower pot...");
	}

	public FlowerPotCracker(String name, double price, int quantity) {
		super();
		super.name = "Test";
		super.price = price;
		// super.quantity=quantity;

		System.out.println("invoked string,double & int in parmetar cons...");
		System.out.println(super.sound);
	}

}
