package com.xworkz.coffee.dao;

import com.xworkz.coffee.dto.ChargerDTO;

public class ChargerDAO {

	private ChargerDTO[] container = new ChargerDTO[25];
	private int power = 0;

	public ChargerDAO() {
		System.out.println("invoked the no-org const");
	}

	public void add(ChargerDTO chargerDTO) {
		if (this.power < this.container.length && chargerDTO != null) {
			this.container[power] = chargerDTO;

			System.out.println("Charger dto added to container at index "
					.concat(String.valueOf(this.power).concat(" Brand: ").concat(chargerDTO.getBrand())));
			power++;
		} else {
			System.err.println("the container passed in null");
		}
	}
	
	public void delete(int index) {
		System.out.println("invoked the delete index: ".concat(String.valueOf(index)));
		if(index>=0 && index<=this.container.length) {
			System.out.println("deleted with the index: ");
			this.container[index]=null;
		}else {
			System.out.println("cannot delet the index its not good");
			
		}
		
	}

}
