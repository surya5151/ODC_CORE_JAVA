package com.xworkz.militery.army;

public class IndianArmy {

	private MilitryJoinRules militryJoinRules;

	public IndianArmy(MilitryJoinRules militryJoinRules) {
		this.militryJoinRules=militryJoinRules; 

	}

	public void joinUs() {
		System.out.println("invoked joinUs");

		if (militryJoinRules != null) {
			double height = militryJoinRules.height();
			int age = militryJoinRules.age();
			String nationality = militryJoinRules.nationality();

			if (age > 18 && age < 35 && height > 5.0 && "Indian".equals(nationality)) {
				System.out.println("join indian army");
			} else {
				System.err.println("can't join indian army");
			}
		} else {
			System.err.println("implements are not provided");
		}
	}

}
