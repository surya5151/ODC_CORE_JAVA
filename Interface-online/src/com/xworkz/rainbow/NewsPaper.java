package com.xworkz.rainbow;

//abstraction principal
public class NewsPaper {

	// has-a relation
	private Rainbow rainbow;

	public NewsPaper(Rainbow rainbow) {
		this.rainbow = rainbow;

	}

	public void displyRainbowColor() {
		rainbow.displayColor();
	}

}
