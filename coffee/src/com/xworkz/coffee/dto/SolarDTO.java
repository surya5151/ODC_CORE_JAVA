package com.xworkz.coffee.dto;

public class SolarDTO {
	
	private String brand;
	private String color;
	private String Capacity;
	private int price;
		
	public SolarDTO(){
		
	}

	public SolarDTO(String brand, String color, String capacity, int price) {
		super();
		this.brand = brand;
		this.color = color;
		Capacity = capacity;
		this.price = price;
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

	public String getCapacity() {
		return Capacity;
	}

	public void setCapacity(String capacity) {
		Capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
