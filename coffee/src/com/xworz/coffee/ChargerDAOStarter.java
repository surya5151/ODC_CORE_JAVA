package com.xworz.coffee;

import com.xworkz.coffee.dao.ChargerDAO;
import com.xworkz.coffee.dto.ChargerDTO;

public class ChargerDAOStarter {

	public static void main(String[] args) {
		
		ChargerDAO dao=new ChargerDAO();
		
		dao.add(null);
		
		ChargerDTO chargerDTO=new ChargerDTO("oppo", "white", 100, 10, "230v", "9v");
		
		dao.add(chargerDTO);
		dao.add(chargerDTO);
		dao.add(null);
		
		ChargerDTO chargerDTO2= new ChargerDTO("vivo", "block", 250, 25,"240v", "5v");
		
		dao.add(chargerDTO2);
		dao.add(null);
		dao.add(chargerDTO2);
		
		
	dao.delete(2);
		
	}

}
