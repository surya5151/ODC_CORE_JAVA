package com.xworkz.earphone.exceptionEvent.exception;

import com.xworkz.earphone.exceptionEvent.MedicalInsurance;

public class MedicalInsuranceStarter {

	public static void main(String[] args) throws CashLessException {

		MedicalInsurance medicalInsurance = new MedicalInsurance();
		medicalInsurance.canAvailCashless("surya", 5);

	}

}
