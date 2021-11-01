package com.xworz.coffee;

import com.xworkz.coffee.dao.CoffeeDAO;
import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeDAOStarter {

	public static void main(String[] args) {

		CoffeeDAO dao = new CoffeeDAO();

		dao.add(null);

		CoffeeDTO coffeeDTO = new CoffeeDTO("Levista", "Instant", "Filter", 300, 55);
		dao.add(coffeeDTO);

		CoffeeDTO coffeeDTO2 = new CoffeeDTO("kothas", "instant", "filter", 400, 65);
		dao.add(coffeeDTO2);
		dao.add(coffeeDTO);
		dao.add(coffeeDTO2);
		dao.add(coffeeDTO2);
		dao.add(coffeeDTO2);
		dao.add(coffeeDTO2);
		
		dao.delete(10);
		
		
		
	}

}
