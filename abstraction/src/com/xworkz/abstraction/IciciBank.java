package com.xworkz.abstraction;

public class IciciBank extends Bank {

	@Override
	public void Bank(String name, String ifscCode) {
		System.out.println("BankName: " + name);
		System.out.println("BankIfscCode: " + ifscCode);

	}

	@Override
	public void provideLoan() {
		System.out.println("Provide Bank loan.....");

	}

	@Override
	public void openAccount() {
		System.out.println("Open Bank Account.....");

	}

	@Override
	public void closeAccount() {
		System.out.println("Close Bank Account....!!!");

	}

}
