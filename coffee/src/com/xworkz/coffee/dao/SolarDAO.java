package com.xworkz.coffee.dao;

import com.xworkz.coffee.dto.SolarDTO;

public class SolarDAO {

	private SolarDTO[] conta = new SolarDTO[20];
	private int water = 0;

	public SolarDAO() {
		System.out.println("invoked no-org");
	}

	public void add(SolarDTO solarDTO) {
		if (this.water < this.conta.length && solarDTO != null) {
			this.conta[water] = solarDTO;
		
			System.out.println("add the index ".concat(String.valueOf(this.water).concat(" Capacity of solar: ").concat(solarDTO.getCapacity())));
		water++;
		}else {
			System.err.println("solar container passed the null");
		}
	}
	
	public void delete(int index) {		
		System.out.println("Invoked the solar capacity of deleted  index: ".concat(String.valueOf(this.water)));
		
		if(index>=0 && index<this.conta.length) {
			this.conta[index]=null;
			System.out.println("Deleted the solar capacity of the index: ".concat(String.valueOf(this.water)));
					
		}else {
			System.err.println("can't deleted the index");
		}
		}
}
