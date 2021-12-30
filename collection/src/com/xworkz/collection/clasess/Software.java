package com.xworkz.collection.clasess;

public class Software {
	
	private String name;
	
	private double price;
	
	private String version;
	
	private boolean isanAutoSave;
	
	private boolean isanInternetApp;
	
	public Software() {
		System.out.println(this.getClass().getSimpleName() +"invoked no- org constructor...");
	}

	public Software(String name, double price, String version, boolean isanAutoSave, boolean isanInternetApp) {
		super();
		this.name = name;
		this.price = price;
		this.version = version;
		this.isanAutoSave = isanAutoSave;
		this.isanInternetApp = isanInternetApp;
	}

	public Software(String name, boolean isanAutoSave, boolean isanInternetApp) {
		super();
		this.name = name;
		this.isanAutoSave = isanAutoSave;
		this.isanInternetApp = isanInternetApp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isIsanAutoSave() {
		return isanAutoSave;
	}

	public void setIsanAutoSave(boolean isanAutoSave) {
		this.isanAutoSave = isanAutoSave;
	}

	public boolean isIsanInternetApp() {
		return isanInternetApp;
	}

	public void setIsanInternetApp(boolean isanInternetApp) {
		this.isanInternetApp = isanInternetApp;
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", price=" + price + ", version=" + version + ", isanAutoSave=" + isanAutoSave
				+ ", isanInternetApp=" + isanInternetApp + "]";
	}
	
	
	
 
}
