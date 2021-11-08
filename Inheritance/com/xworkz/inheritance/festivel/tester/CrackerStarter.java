package com.xworkz.inheritance.festivel.tester;

import com.xworkz.inheritance.festival.deepavali.FlowerPotCracker;
import com.xworkz.inheritance.festival.deepavali.chrismes.RocketCracker;

public class CrackerStarter {

	public static void main(String[] args) {

		FlowerPotCracker flowerPotCracker = new FlowerPotCracker("Standerd", 50, 25);

		System.out.println(flowerPotCracker.name);
		// System.out.println(flowerPotCracker.price);
		// System.out.println(flowerPotCracker.quantity);

		RocketCracker rocketCracker = new RocketCracker();
		// System.out.println(rocketCracker.sound);

	}

}
