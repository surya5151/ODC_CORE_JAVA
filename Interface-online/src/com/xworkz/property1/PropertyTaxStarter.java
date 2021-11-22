package com.xworkz.property1;

import com.xworkz.property.bridge.PropertyTaxRules;
import com.xworkz.property.bridge.PublicPropertyTaxRule;

public class PropertyTaxStarter {
	
	public static void main(String[] args) {
		
		PropertyTaxRules propertyTaxRules = new PublicPropertyTaxRule() {
		};
	boolean comm = propertyTaxRules.commercial();
	boolean resi= propertyTaxRules.residencial();
	double total = propertyTaxRules.totalTax();
	
	System.out.println(comm);
	System.out.println(resi);
	System.out.println(total); 
		
	}

}
