package com.xworkz.earphone.exceptionEvent;

public class EventCreator {

	public EventCreator() {
		System.out.println("invoked no-org con....");
	}

	public void createExceptionEvent(boolean created) {

		if (created) {
			System.out.println("Going to create event ");
			RuntimeException runtimeException = new RuntimeException();
			throw runtimeException;

		} else {
			System.out.println("event is not created");
		}

	}

}
