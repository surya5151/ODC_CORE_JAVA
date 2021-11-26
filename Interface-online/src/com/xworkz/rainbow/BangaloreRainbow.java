package com.xworkz.rainbow;

public class BangaloreRainbow implements Rainbow {

	@Override
	public void displayColor() {
		System.out.println("invoked bangalore rainbow");
		Rainbow.displayTotalColor();
		System.out.println(Rainbow.TOTAL_COLOR);
	}

	@Override
	public String getFirstColor() {
		return "Yellow";
	}

}
