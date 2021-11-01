package com.xworz.coffee;

import com.xworkz.coffee.dao.SolarDAO;
import com.xworkz.coffee.dto.SolarDTO;

public class SolarDAOStarter {

	public static void main(String[] args) {

		SolarDAO dao = new SolarDAO();

		SolarDTO solarDTO = new SolarDTO("power", "white", "250ltr", 25000);

		dao.add(solarDTO);
		dao.add(solarDTO);
		dao.add(null);
		
		SolarDTO solarDTO2 = new SolarDTO("Deepa", "Cream", "300ltr", 30000);
		
		dao.add(solarDTO2);
		
		dao.delete(0);
		
		dao.delete(10);
	

	}

}
