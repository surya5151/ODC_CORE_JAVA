package com.xworkz.property1;

import com.xworkz.property.bridge.HospitalRules;
import com.xworkz.property.bridge.HostelRules;
import com.xworkz.property.bridge.StudentHostelRules;

public class HostelRulesStarter {

	public static void main(String[] args) {
		HostelRules hostelRules = new StudentHostelRules();
		boolean b = hostelRules.admission();
		double d = hostelRules.closeTime();
		String s = hostelRules.gender();

		System.out.println(b);
		System.out.println(d);
		System.out.println(s);

	}

}
