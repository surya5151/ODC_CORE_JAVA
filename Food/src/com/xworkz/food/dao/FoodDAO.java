package com.xworkz.food.dao;

import com.xworkz.food.dto.FoodDTO;

public class FoodDAO {
	private FoodDTO[] container = new FoodDTO[4];
	private int rise = 0;

	public FoodDAO() {
		System.out.println("Invoked no-org constructor");
	}

	public void save(FoodDTO foodDTO) {

		if (this.rise < this.container.length && foodDTO != null) {
			this.container[rise] = foodDTO;

			System.out.println("FoodDTO add to the container at the index "
					.concat(String.valueOf(this.rise).concat(" Name of Item: ").concat(foodDTO.getName())));
			rise++;
		} else {
			System.err.println("the container passed in the null");
		}
	}

	public void updatePriceByName(String name, double prize) {

		System.out.println("Invoked the update price by name");
		if (name != null && prize > 0) {
			for (int pickal = 0; pickal < this.container.length; pickal++) {
				FoodDTO foodDTO = this.container[pickal];
				if (foodDTO != null) {
					if (foodDTO.getName().equals(name)) {
						System.out.println("Updating the prize by using  Name");

					} else {
						System.err.println("Name not matched for updating");
					}

				}

			}

		}

	}

	public void updateQuantityByName(String name, int quantity) {

		System.out.println("Invoked the update quantity by name");
		if (name != null && quantity > 0) {
			for (int cup = 0; cup < this.container.length; cup++) {
				FoodDTO foodDTO = this.container[cup];
				if (foodDTO != null) {
					if (foodDTO.getName().equals(name)) {
						System.out.println("Updating the quantity by using  Name");

					}

				}

			}

		}

	}
	
	public void findByName(String name) {
		
		System.out.println("invoked find by name");
		
		if(name!=null) {
			for(int plate=0; plate<this.container.length; plate++) {
				FoodDTO foodDTO= this.container[plate];
				if(foodDTO != null) {
					if(name.equals(name)) {
						System.out.println("Name is matched ".concat(name));
						
					}else {
						System.err.println("Name not matched");
					}
				}
			}
		}
		
	}

	public void findByNameAndPrice(String name, double price) {
		
		System.out.println("invoked the find by name and price");
		
		if(name!=null && price!=0) {
			for(int mouse=0; mouse<this.container.length; mouse++) {
			FoodDTO foodDTO= this.container[mouse];
			if(foodDTO !=null) {
				String foodName=foodDTO.getName();
				double foodPrice=foodDTO.getPrice();
				
				if(foodName.equals(name)   ) {
					System.out.println("name are matched ".concat(name));
					if(foodPrice== price) {
						System.out.println("price are matched ".concat(name));
					}else {
						System.err.println("not matched");
					}
				}
			}
			}
		}
		
	}
	
public void findByNameAndType(String name, String type) {
		
		System.out.println("invoked the find by name and type");
		
		if(name!=null && type!=null) {
			for(int pen=0; pen<this.container.length; pen++) {
			FoodDTO foodDTO= this.container[pen];
			if(foodDTO !=null) {
				String foodName=foodDTO.getName();
				String foodType =foodDTO.getType();
				
				if(foodName.equals(name)   ) {
					System.out.println("name are matched ".concat(name));
					if(foodType.equals(type)) {
						System.out.println("Type are matched ".concat(name));
					}else {
						System.err.println("not matched");
					}
				}
			}
			}
		}
		
	}
	
	
}
