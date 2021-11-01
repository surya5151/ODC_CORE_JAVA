package com.xworkz.coffee.dao;

import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeDAO {

	private CoffeeDTO[] coffeeContainer = new CoffeeDTO[10];
	private int cup = 0;

	public CoffeeDAO() {

		System.out.println("invoked no-arg const from dao");
	}

	public void add(CoffeeDTO coffeeDTO) {
		if (this.cup < this.coffeeContainer.length && coffeeDTO != null) {
			this.coffeeContainer[cup] = coffeeDTO;
			System.out.println("coffee dto added to container at index "
					.concat(String.valueOf(this.cup).concat(" Brand: ")).concat(coffeeDTO.getBrand()));
			cup++;
		} else {
			System.err.println("the coffee container is full or passed in the null");

		}
	}

	public void delete(int index) {

		System.out.println("invoke delete with index ".concat(String.valueOf(index)));
		if (index >= 0 && index < this.coffeeContainer.length) {
			this.coffeeContainer[index] = null;
			System.out.println("dleted coffee with the index");
		} else {
			System.err.println("cannot delete, index is not good ");
		}

	}

	public void findByBrand(String brandName) {
		System.out.println("Invoked the findByBrand ");

		if (brandName != null) {
			for (int glass = 0; glass < this.coffeeContainer.length; glass++) {

				CoffeeDTO coffeeDTO = this.coffeeContainer[glass];
				if (coffeeDTO != null) {
					String brand = coffeeDTO.getBrand();
					if (brand.equals(brandName)) {
						System.out.println("Brand is matched ".concat(brandName));
					}
				}
			}
		} else {
			System.err.println("Brand name cannot be null");
		}
	}

	public void findByQuantity(int quantity) {
		System.out.println("invoked the findByQuantity".concat(String.valueOf(quantity)));
		if (quantity != 0) {
			for (int bottle = 0; bottle < this.coffeeContainer.length; bottle++) {

				CoffeeDTO coffeeDTO = this.coffeeContainer[bottle];
				if (coffeeDTO != null) {
					int q = coffeeDTO.getQuantity();
					if (q == quantity) {
						System.out.println("Quantity matched: ".concat(coffeeDTO.getBrand()));

					} else {
						System.err.println("Quantity not matched: ".concat(coffeeDTO.getBrand()));
					}
				}
			}

		} else {
			System.out.println("quantity cannot be less than zero");

		}

	}

	public void updateQuantityByBrand(String brandName, int quantity) {

		System.out.println("invoked the updateQuantity ");
		if (brandName != null && quantity > 0) {

			for (int make = 0; make < this.coffeeContainer.length; make++) {
				CoffeeDTO coffeeDTO = this.coffeeContainer[make];
				if (coffeeDTO != null) {
					if (coffeeDTO.getBrand().equals(brandName)) {
						System.out.println("Brand matched,  updating quantity");
						coffeeDTO.setQuantity(quantity);

					}
				}

			}
		}

	}

}
