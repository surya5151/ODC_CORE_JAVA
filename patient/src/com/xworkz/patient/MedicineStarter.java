package com.xworkz.patient;

import com.xworkz.patient.operator.MedicineOperator;

public class MedicineStarter {
	
	public static void main(String[] args) {
		
		MedicineOperator operator= new MedicineOperator();
		
		operator.add("thyronom");
		
		operator.add(null);
				
		operator.displayMedicineName();
		
		operator.add("coldAct");
		operator.add("omee");
		operator.add("Maxodom");
		operator.add("Monto");
		operator.add("test");		
		operator.displayMedicineName();
		
		operator.delete(2);
		operator.delete(3);
		operator.delete(-1); 
		operator.displayMedicineName();
		
		operator.update(1, "deflu");
		operator.displayMedicineName();
	}

}
