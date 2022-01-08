package com.xworkz.abstraction.starter;

import com.xworkz.abstraction.Bank;
import com.xworkz.abstraction.HdfcBank;
import com.xworkz.abstraction.IciciBank;

public class BankStarter {

	public static void main(String[] args) {

		Bank bank1 = new IciciBank(); 
		bank1.Bank("ICICI", "ICI000098","VijayNagar");
		bank1.provideLoan();
		bank1.openAccount();
		bank1.closeAccount();
		System.out.println("...............................");
		Bank bank2 = new HdfcBank();
		bank2.Bank("HDFC", "hdfc123", "SanjayNagar");
		bank2.provideLoan();
		bank2.openAccount();
		bank2.closeAccount();

	}

}
