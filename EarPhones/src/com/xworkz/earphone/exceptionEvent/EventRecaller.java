package com.xworkz.earphone.exceptionEvent;

import java.rmi.activation.ActivationException;

import javax.management.RuntimeErrorException;

public class EventRecaller {

	public EventRecaller() {
		System.out.println("Created no-org cons...");

	}

	public void recap(int dog, int omicron) throws Exception{

		if (dog + omicron == 45) { 
			System.out.println("i will explicitly create event ");
			throw new Exception();
		}else {
			System.out.println("Event is not created ");
		}
	}

}
