package com.xworz.coffee;

import com.xworkz.coffee.dto.BluetoothDTO;

public class BluetoothStarter {

	public static void main(String... value) {

		BluetoothDTO bluetoothDTO = new BluetoothDTO();

		bluetoothDTO.setBrand("LG");
		bluetoothDTO.setColor("Block");
		bluetoothDTO.setPrice(150);
		bluetoothDTO.setQuentity(10);

		System.out.println(bluetoothDTO.getBrand().concat(" ") + bluetoothDTO.getColor().concat(" ")
				+ (String.valueOf(bluetoothDTO.getPrice())).concat(" ") + (String.valueOf(bluetoothDTO.getQuentity())));

		
		
		BluetoothDTO bluetoothDTO2 = new BluetoothDTO("Sony","white",350,5);
		
		System.out.println(bluetoothDTO2.getBrand().concat(" ") + bluetoothDTO2.getColor().concat(" ")
				+ (String.valueOf(bluetoothDTO2.getPrice())).concat(" ") + (String.valueOf(bluetoothDTO2.getQuentity())));

		
	}

}
