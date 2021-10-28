package com.xworkz.patient;

import com.xworkz.patient.operator.MedicineOperator;

public class MedicineStarter {
	
	public static void main(String[] args) {
		
		MedicineOperator operator= new MedicineOperator();
		
		//step-1
		operator.add("thyronom");
		
		//step-2
		operator.add(null);
		
		//step-3
		operator.displayMedicineName();
		
		operator.add("coldAct");
		operator.add("omee");
		operator.add("Maxodom");
		operator.add("Monto");
		operator.add("test");		
		operator.displayMedicineName();
	}

}
