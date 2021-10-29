package com.xworz.coffee;

import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeTester {

	public static void main(String[] args) {

		CoffeeDTO coffeeDTO = new CoffeeDTO();

		coffeeDTO.setBrand("Bru");
		coffeeDTO.setFlavour("choco");
		coffeeDTO.setType("filter");
		coffeeDTO.setQuantity(100);
		coffeeDTO.setCoffinePercentage(40);

		String brand = coffeeDTO.getBrand();
		String flavour = coffeeDTO.getFlavour();
		String type = coffeeDTO.getType();

		System.out.println(brand.concat(" ").concat(flavour).concat(" ").concat(" ").concat(type).concat(" ")
				.concat(String.valueOf(coffeeDTO.getQuantity()).concat(" ")
						.concat(String.valueOf(coffeeDTO.getCoffinePercentage()))));

		CoffeeDTO coffeeDTO2 = new CoffeeDTO("Nescafe", "Black Rost", "Filter", 200, 35);

		System.out.println(coffeeDTO2.getBrand().concat(" ").concat(coffeeDTO2.getFlavour()).concat(" ").concat(" ")
				.concat(coffeeDTO2.getType()).concat(" ").concat(String.valueOf(coffeeDTO2.getQuantity()).concat(" ")
						.concat(String.valueOf(coffeeDTO2.getCoffinePercentage()))));

	}

}
