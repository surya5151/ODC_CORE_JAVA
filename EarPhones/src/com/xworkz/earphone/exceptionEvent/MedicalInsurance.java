package com.xworkz.earphone.exceptionEvent;

import com.xworkz.earphone.exceptionEvent.exception.CashLessException;

public class MedicalInsurance {

	public void canAvailCashless(String name, double totalHourInHospital) throws CashLessException {

		System.out.println("invoked can avail cashless method");

		if (name != null && name.length() > 2 && name.length() <= 26 && totalHourInHospital <= 3) {

			System.out.println("Availble for cash less");

		} else {
			System.out.println("Not available for cash less");
			throw new CashLessException();

		}

	}

}
