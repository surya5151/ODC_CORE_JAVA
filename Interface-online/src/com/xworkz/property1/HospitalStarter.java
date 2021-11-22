package com.xworkz.property1;

import com.xworkz.property.bridge.HospitalRules;
import com.xworkz.property.bridge.PatientHospitalRules;

public class HospitalStarter {

	public static void main(String[] args) {
		HospitalRules hospitalRules = new PatientHospitalRules() {
		};
		String str = hospitalRules.register();
		double d = hospitalRules.payAdvance();
		boolean b = hospitalRules.validInsurance();
		
		System.out.println(str);
		System.out.println(d);
		System.out.println(b);

	}

}
