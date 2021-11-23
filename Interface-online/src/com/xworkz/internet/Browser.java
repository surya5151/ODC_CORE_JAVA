package com.xworkz.internet;

public class Browser {

	private Internet internet;
	private boolean connect;

	public Browser(Internet internet) {
		this.internet = internet;
	}

	public void browser() {
		boolean connect = internet.connect();
		int speed = internet.speed();

		if (connect = true && speed >= 1) {
			System.out.println("Browser working....");

		} else {
			System.err.println("Browser not working!!!!!!");
		}
	}

	public void errorInConnecting() {
		System.out.println("invoked errorInConnection");

		internet.disConnect();
		if (connect = false) {
			System.out.println("Internet not connected");

		}

	}
}
