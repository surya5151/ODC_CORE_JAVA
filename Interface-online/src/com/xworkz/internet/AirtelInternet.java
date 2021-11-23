package com.xworkz.internet;

public class AirtelInternet implements Internet {

	public AirtelInternet() {
		System.out.println("invoked no-org in Airtel Internet...");

	}

	@Override
	public boolean connect() {
		System.out.println("invoked airtel connect....");
		return true;
	}

	@Override
	public int speed() {
		System.out.println("invoked airtel speed....");
		return 100;
	}

	@Override
	public void disConnect() {
		System.err.println("invoked airtel disconnect....");

	}

}
