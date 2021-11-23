package com.xworkz.electionRules;

public class ElectionCommision {

	private ElectionRules electionRules;

	public ElectionCommision(ElectionRules electionRules) {
		this.electionRules = electionRules;
	}

	public void provideVoterID() {
		int age = electionRules.validAge();
		int wardNo = electionRules.wardNo();
		String address = electionRules.address();
		
		if(electionRules!=null) {
		if(age>=18 && wardNo>=1 && wardNo<=300 && address.length()>=10 && address.length()<=50 ){
			System.out.println("voter id can be provide");
			
		}else {
			System.out.println("voter id not provide");
		}
	}else {
		System.out.println("referance not provide");
	}
	}

}
