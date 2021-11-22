package com.xworkz.property.bridge;

public abstract class PublicPropertyTaxRule implements PropertyTaxRules {

	@Override
	public boolean residencial() {
		System.out.println("invoked residencial");
		return true;
	}

	@Override
	public boolean commercial() {
		System.out.println("invoked commercial");
		return false;
	}

	@Override
	public double totalTax() {
	System.out.println("invoked totalTax");
		return 0;
	}

}
