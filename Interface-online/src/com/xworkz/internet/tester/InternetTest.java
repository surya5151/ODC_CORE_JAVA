package com.xworkz.internet.tester;

import com.xworkz.internet.AirtelInternet;
import com.xworkz.internet.Browser;
import com.xworkz.internet.Internet;
import com.xworkz.internet.TataInternet;

public class InternetTest {

	public static void main(String[] args) {
		Internet internet1 = new AirtelInternet();

		Internet internet2 = new TataInternet();

		Browser browser1 = new Browser(internet1);
		browser1.browser();
		browser1.errorInConnecting();

		Browser browser2 = new Browser(internet2);
		browser2.browser();
		browser2.errorInConnecting();

	}

}
