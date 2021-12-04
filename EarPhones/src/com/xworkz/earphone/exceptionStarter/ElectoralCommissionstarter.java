package com.xworkz.earphone.exceptionStarter;

import com.xworkz.earphone.exceptionEvent.ElectrolCommission;
import com.xworkz.earphone.exceptionEvent.exception.NotEligableForVote;

public class ElectoralCommissionstarter {

	public static void main(String[] args) throws NotEligableForVote {

		ElectrolCommission electrolCommission = new ElectrolCommission();
		electrolCommission.canVote("surya", 15);

	}

}
