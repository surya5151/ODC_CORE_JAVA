package com.xworkz.woodshop.design;

public class ComputerTable extends Furniture {

	public String color = "Brown";

	public ComputerTable() {
		System.out.println("invoked no-org cons form ComputerTable");
	}

	public ComputerTable(String color, int quantity, double price, String name) {

		super.color = "Dark";
		super.quantiry = quantity;
		// super.price=price;
		super.shopName = name;

		System.out.println("invoked computerTable with parame....");

	}

}