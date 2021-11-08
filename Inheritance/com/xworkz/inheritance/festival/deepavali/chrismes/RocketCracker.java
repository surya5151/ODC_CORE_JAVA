package com.xworkz.inheritance.festival.deepavali.chrismes;

import com.xworkz.inheritance.festival.deepavali.Cracker;

public class RocketCracker extends Cracker {

	public RocketCracker() {
		System.out.println("invoked no-org cons from Rocket cracker");
		super.sound=false;
		System.out.println(super.sound);
	}

}
