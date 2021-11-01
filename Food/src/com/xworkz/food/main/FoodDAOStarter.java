package com.xworkz.food.main;

import com.xworkz.food.dao.FoodDAO;
import com.xworkz.food.dto.FoodDTO;

public class FoodDAOStarter {

	public static void main(String[] args) {
		
		FoodDAO dao = new FoodDAO();
		
				//operation-1
		FoodDTO foodDto= new FoodDTO(1, "RiseBath", "veg",50, 10);
		
		dao.save(foodDto);
		dao.save(null);
		
		FoodDTO foodDTO2 = new FoodDTO(2, "Idly", "veg", 40, 20);
		dao.save(foodDTO2);
		
		FoodDTO foodDTO3 = new FoodDTO(3, "ChickanRise", "Non-veg", 200, 10);
		dao.save(foodDTO3);
		
		FoodDTO foodDTO4 = new FoodDTO(4, "MutonRise", "Non-veg", 300, 30);
		dao.save(foodDTO4);
		
		FoodDTO foodDTO5 = new FoodDTO(5, "Piza", "veg", 400, 5);
		dao.save(foodDTO5);
		
		//oper-2
		dao.updatePriceByName("Idly", 50);
		//dao.updatePriceByName("chapthi", 20);		
		
		//oper-3
		dao.updateQuantityByName("MutonRise", 50);
		
		//oper-4
		dao.findByName("Idly");
		
		//oper-5
		dao.findByNameAndPrice("RiseBath", 50.00);
	
		//oper-6
		dao.findByNameAndType("RiseBath", "veg");
	}

}
