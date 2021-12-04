package com.xworkz.earphone.exceptionStarter;

import com.xworkz.earphone.exceptionEvent.AmazonPrime;
import com.xworkz.earphone.exceptionEvent.exception.NotPrimeMemberException;

public class AmazonPrimeStarter {

	public static void main(String[] args) throws NotPrimeMemberException {

		AmazonPrime amazonPrime = new AmazonPrime();
		amazonPrime.freeDelivery(true, "India");
	}

}
