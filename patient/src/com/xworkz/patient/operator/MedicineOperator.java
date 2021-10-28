package com.xworkz.patient.operator;

public class MedicineOperator {

	private String[] continer = new String[5]; // instance ref variable(non-static)
	private int count = 0;

	public MedicineOperator() {
		System.out.println("invoked no-arg constructor");
	}

	public void add(String medicineName) {
		System.out.println("invoked add ");

		if (medicineName != null && this.count<this.continer.length) {

			this.continer[count] = medicineName;
			count++;
			System.out.println("Added medicin ".concat(medicineName));
		} else {
			System.out.println("medicine name not null or container is full");
		}
	}

	public void displayMedicineName() {
		System.out.println("invoked displayMedicineName");
		for (int tablet = 0; tablet < continer.length; tablet++) {
			String ref = this.continer[tablet];
			System.out.println(ref);
		}

	}

}
