package com.xworz.coffee;

import com.xworkz.coffee.dto.SolarDTO;

public class SolarTester {

	public static void main(String[] args) {

		SolarDTO solarDTO = new SolarDTO();

		solarDTO.setBrand("SunPay");
		solarDTO.setColor("white");
		solarDTO.setCapacity("200ltr");
		solarDTO.setPrice(15000);

		System.out.println(solarDTO.getBrand().concat(" ").concat(solarDTO.getColor().concat(" ")
				.concat(solarDTO.getCapacity().concat(" ").concat(String.valueOf(solarDTO.getPrice())))));

		
	SolarDTO solarDTO2=	new SolarDTO("Surya","Cream","350ltr",25000);
	
	System.out.println(solarDTO2.getBrand().concat(" ").concat(solarDTO2.getColor().concat(" ")
			.concat(solarDTO2.getCapacity().concat(" ").concat(String.valueOf(solarDTO2.getPrice())))));

	
	}

}
