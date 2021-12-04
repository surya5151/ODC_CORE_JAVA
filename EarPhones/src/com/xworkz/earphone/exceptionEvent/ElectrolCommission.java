package com.xworkz.earphone.exceptionEvent;

import com.xworkz.earphone.exceptionEvent.exception.NotEligableForVote;

public class ElectrolCommission {
	
	public void canVote(String name, int age ) throws NotEligableForVote  {
		System.out.println("invoked can vote people ");
		
		if(name.length()>2 && name.length()<=26 && age>=18) {
			System.out.println("Eligable for vote");
			
			
		}else {
			System.out.println("Not eligable for vote");
			throw  new NotEligableForVote();
		}
		
	}

}
