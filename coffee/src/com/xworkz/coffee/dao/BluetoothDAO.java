package com.xworkz.coffee.dao;

import com.xworkz.coffee.dto.BluetoothDTO;


public class BluetoothDAO {

	private BluetoothDTO[] Container = new BluetoothDTO[25];
	private int nos = 0;

	public BluetoothDAO() {
		System.out.println("invoked no-org const from dao");
	}

	public void add(BluetoothDTO bluetoothDTO) {
		if (this.nos < this.Container.length && bluetoothDTO != null) {

			this.Container[nos] = bluetoothDTO;

			System.out.println("coffee container add index ".concat(String.valueOf(this.nos)).concat(" Brand is ")
					.concat(bluetoothDTO.getBrand()));
			nos++;
		} else {
			System.out.println("coffe container have null");
		}
	}
	
	public void delete(int index) {
		System.out.println("invokd the delet index ".concat(String.valueOf(index)));
		if(index>=0 && index<this.Container.length) {
			this.Container[index]=null;
			
			System.out.println("Deleted the index ".concat(String.valueOf(index)));	
			
		}else {
			System.out.println("cannot delete index");
		}
		
		
		
	}

}
