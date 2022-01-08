package com.xworkz.abstraction;

public abstract class Bank {
	
	String Bank;
	String IfscCode;
	String Address;

	public abstract void Bank(String name, String ifscCode, String Address);
	public abstract void provideLoan();
	public abstract void openAccount();
	public abstract void closeAccount();
	
	public String getBankName() {
		return Bank;
		
	}
	public String GetIfscCode() {
		return IfscCode;
		
	}
	

}
