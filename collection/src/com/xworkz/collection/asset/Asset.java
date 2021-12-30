package com.xworkz.collection.asset;

public interface Asset {
	
	void addAsset(Object object);
	
	void searchAsset(Object object);
	
	void updateAsset(Object object, String name);
	
	void updateAsset(Object object, double price);
	
	void deletAsset(Object object);
	
	void listOfAsset();

}
