package com.xworkz.rainbow.starter;

import com.xworkz.rainbow.BangaloreRainbow;
import com.xworkz.rainbow.NewsPaper;
import com.xworkz.rainbow.Rainbow;

public class RainbowStarter {

	public static void main(String[] args) {

		Rainbow rainbow = new BangaloreRainbow();

		NewsPaper newsPaper = new NewsPaper(rainbow);

		newsPaper.displyRainbowColor();

	}

}
