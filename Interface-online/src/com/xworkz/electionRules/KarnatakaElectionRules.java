package com.xworkz.electionRules;

public class KarnatakaElectionRules implements ElectionRules {

	public KarnatakaElectionRules() {
		System.out.println("invoked no-org");
	}

	@Override
	public int validAge() {
		System.out.println("invoked age");
		return 18;
	}

	@Override
	public int wardNo() {
		System.out.println("invoked wardNo");
		return 35;
	}

	@Override
	public String address() {
		System.out.println("invoked Address");
		return "#35, 4th block, Bangalore";
	}

}
