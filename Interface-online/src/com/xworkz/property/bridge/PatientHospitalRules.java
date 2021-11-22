package com.xworkz.property.bridge;

public abstract class PatientHospitalRules implements HospitalRules {

	@Override
	public String register() {
		System.out.println("Invoked Register");
		return null;
	}

	@Override
	public double payAdvance() {
		System.out.println("Invoked payAdvance");
		return 0;
	}

	@Override
	public boolean validInsurance() {
		System.out.println("Invoked validInsurance");
		return true;
	}

}
