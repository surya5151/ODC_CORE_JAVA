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
	 public void delete(int index) {
		 System.out.println("invoked delete");
		 if(index<this.continer.length && index>=0) {
		 this.continer[index]=null;
		 }else {
			 System.out.println("invalid index, index is less thean ".concat(String.valueOf(this.continer.length).concat(" and grater then zero")));
		 } 
	 }
	 
	 public void update(int indexForUpdate, String newMedicineName ) {
		 System.out.println("Invoked update");
		 if(indexForUpdate>=0 && indexForUpdate<this.continer.length && newMedicineName!=null) { 
			
			this.continer[indexForUpdate]=newMedicineName;
		 }else {
			 System.out.println("invalid index, index is less thean ".concat(String.valueOf(this.continer.length).concat(" and grater then zero")));
		 System.out.println("and new madicine name not be null");
		 }
		 
	 }

}
