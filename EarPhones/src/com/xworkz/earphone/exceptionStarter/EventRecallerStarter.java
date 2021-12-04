package com.xworkz.earphone.exceptionStarter;

import com.xworkz.earphone.exceptionEvent.EventRecaller;

public class EventRecallerStarter {

	public static void main(String[] args) throws Exception {
		
		EventRecaller eventRecaller = new EventRecaller();
		
		eventRecaller.recap(40, 5);
	}

}
