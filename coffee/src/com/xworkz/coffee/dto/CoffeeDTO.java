package com.xworkz.coffee.dto;

public class CoffeeDTO {
	private String brand;
	private String flavour;
	private String type;
	private int quantity;
	private double coffinePercentage;

	public CoffeeDTO() {

	}

	public CoffeeDTO(String brand, String flavour, String type, int quantity, double coffinePercentage) {
		super();
		this.brand = brand;
		this.flavour = flavour;
		this.type = type;
		this.quantity = quantity;
		this.coffinePercentage = coffinePercentage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCoffinePercentage() {
		return coffinePercentage;
	}

	public void setCoffinePercentage(double coffinePercentage) {
		this.coffinePercentage = coffinePercentage;
	}

}
