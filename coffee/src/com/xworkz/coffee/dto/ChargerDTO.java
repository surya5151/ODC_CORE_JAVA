package com.xworkz.coffee.dto;

public class ChargerDTO {
	private String brand;
	private String color;
	private double price;
	private int quantity;
	private String inputVolts;
	private String outputVolts;

	public ChargerDTO() {

	}

	public ChargerDTO(String brand, String color, double price, int quantity, String inputVolts, String outputVolts) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.inputVolts = inputVolts;
		this.outputVolts = outputVolts;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInputVolts() {
		return inputVolts;
	}

	public void setInputVolts(String inputVolts) {
		this.inputVolts = inputVolts;
	}

	public String getOutputVolts() {
		return outputVolts;
	}

	public void setOutputVolts(String outputVolts) {
		this.outputVolts = outputVolts;
	}

}
