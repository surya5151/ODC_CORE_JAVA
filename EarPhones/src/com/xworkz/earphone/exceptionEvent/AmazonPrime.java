package com.xworkz.earphone.exceptionEvent;

import com.xworkz.earphone.exceptionEvent.exception.NotPrimeMemberException;

public class AmazonPrime {

	public void freeDelivery(boolean primember, String country) throws NotPrimeMemberException {
		System.out.println("invoked free delivery ");

		if (primember && country != null && country.equals("India")) {
			System.out.println("Eligable for free delivery");

		} else {
			System.out.println("Not eligable for free delivery");
			throw new NotPrimeMemberException();
		}

	}

}
