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
			System.out.println("coffe dto added to container at index "
					.concat(String.valueOf(this.cup).concat(" Brand: ")).concat(coffeeDTO.getBrand()));
			cup++;
		} else {
			System.err.println("the coffe container is full or passed in the null");

		}
	}
	
	public void delete(int index) {
		
		System.out.println("invoke delete with index ".concat(String.valueOf(index)));
		if(index>=0 && index<this.coffeeContainer.length) {
		this.coffeeContainer[index]=null;
		System.out.println("dleted coffee with the index");
	}else {
		System.out.println("cannot delete, index is not good ");
}
	
}
}
