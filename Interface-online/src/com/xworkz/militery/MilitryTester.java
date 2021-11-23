package com.xworkz.militery;

import com.xworkz.militery.army.IndianArmy;
import com.xworkz.militery.army.MilitryJoinRules;
import com.xworkz.militery.army.SuryaMilitryJoinRules;

public class MilitryTester {

	public static void main(String[] args) {
		MilitryJoinRules militryJoinRules = new SuryaMilitryJoinRules();

		IndianArmy army = new IndianArmy(militryJoinRules);
		army.joinUs();
	}

}
