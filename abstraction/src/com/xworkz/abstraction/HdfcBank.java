package com.xworkz.abstraction;

public class HdfcBank extends Bank {

	@Override
	public void Bank(String name, String ifscCode,String Address) {
		System.out.println("Bank Name: " + name);
		System.out.println("Bank IfscCode: " + ifscCode);
	}

	@Override
	public void provideLoan() {
		System.out.println("Bank will provide loan........");

	}

	@Override
	public void openAccount() {
		System.out.println("Open your bank Account........");
	}

	@Override
	public void closeAccount() {
		System.out.println("Closed your bank Account......!!!!!!!!!");
	}

	

}
