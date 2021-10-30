package com.xworkz.coffee.dto;

public class BluetoothDTO {
	
	private String brand;
	private String color;
	private double price;
	private int quentity;
	
	public BluetoothDTO() {
		
	}
	
	
	public BluetoothDTO(String brand, String color, double price, int quentity) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.quentity = quentity;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuentity() {
		return quentity;
	}
	public void setQuentity(int quentity) {
		this.quentity = quentity;
	}
	
}
