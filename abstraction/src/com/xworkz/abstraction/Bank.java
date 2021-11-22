package com.xworkz.abstraction;

public abstract class Bank {
	
	String IciciBank;
	String IfscCode;

	public abstract void Bank(String name, String ifscCode);
	public abstract void provideLoan();
	public abstract void openAccount();
	public abstract void closeAccount();
	
	public String getBankName() {
		return IciciBank;
		
	}
	public String GetIfscCode() {
		return IfscCode;
		
	}

}
