package com.xworkz.earphone.exceptionEvent;

import com.xworkz.earphone.exceptionEvent.exception.MBBSSeatException;

public class AdmissionCell {

	public void admitForMbbs(String name, boolean pucCleared, boolean biologyAsMajor) throws MBBSSeatException {
		System.out.println("invoked admitForMbbs ");

		if (name != null && name.length() > 2 && name.length() <= 26 && pucCleared && biologyAsMajor) {

			System.out.println("can give mbbs seat");
		} else {
			System.out.println("can not give mbbs seat");
			throw new MBBSSeatException("Name should be min 2char and max 26char and puc cleard and biolage is major");
		}

	}

}
