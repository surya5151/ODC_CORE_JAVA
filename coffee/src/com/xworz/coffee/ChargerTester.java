package com.xworz.coffee;

import com.xworkz.coffee.dto.ChargerDTO;

public class ChargerTester {

	public static void main(String[] args) {

		ChargerDTO chargerDTO = new ChargerDTO();
		chargerDTO.setBrand("vivo");
		chargerDTO.setColor("white");
		chargerDTO.setPrice(200);
		chargerDTO.setQuantity(10);
		chargerDTO.setInputVolts("230v");
		chargerDTO.setOutputVolts("9v");

		String brand = chargerDTO.getBrand();
		String color = chargerDTO.getColor();
		String price = String.valueOf(chargerDTO.getPrice());
		String quantity = String.valueOf(chargerDTO.getQuantity());
		String inputVolts = chargerDTO.getInputVolts();
		String outputVolts = chargerDTO.getOutputVolts();

		System.out.println(brand.concat(" ").concat(color).concat(" ").concat(price).concat(" ").concat(quantity)
				.concat(" ").concat(inputVolts).concat(" ").concat(outputVolts));

		ChargerDTO chargerDTO2 = new ChargerDTO("Samsung", "Block", 150, 20, "240v", "5v");
		System.out.println(chargerDTO2.getBrand().concat(" ") + chargerDTO2.getColor().concat(" ")
				+ String.valueOf(chargerDTO2.getPrice()).concat(" ")
				+ String.valueOf(chargerDTO2.getQuantity()).concat(" ") + chargerDTO2.getInputVolts().concat(" ")
				+ chargerDTO2.getOutputVolts());

	}

}
