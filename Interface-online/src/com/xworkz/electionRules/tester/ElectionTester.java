package com.xworkz.electionRules.tester;

import com.xworkz.electionRules.ElectionCommision;
import com.xworkz.electionRules.ElectionRules; 
import com.xworkz.electionRules.KarnatakaElectionRules;

public class ElectionTester {
	
	public static void main(String[] args) {
		ElectionRules electionRules = new KarnatakaElectionRules();
		
		ElectionCommision election = new ElectionCommision(electionRules);
		election.provideVoterID();
		
	}

}
