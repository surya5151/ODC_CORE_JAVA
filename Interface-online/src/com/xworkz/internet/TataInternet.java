package com.xworkz.internet;

public class TataInternet implements Internet {

	public TataInternet() {
		System.out.println("invoked no-org in Tata Internet!!!!!");
	}

	@Override
	public boolean connect() {
		System.out.println("invoked tata connection!!!!!");
		return false;
	}

	@Override
	public int speed() {
		System.out.println("invoked tata speed!!!!!!!");
		return 0;
	}

	@Override
	public void disConnect() {
		System.err.println("invoked tata disconnect!!!!!!");

	}

}
