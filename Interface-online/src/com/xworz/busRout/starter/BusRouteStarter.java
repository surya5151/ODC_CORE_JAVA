package com.xworz.busRout.starter;

import com.xworz.busRout.dto.BusRouteDAO;
import com.xworz.busRout.dto.BusRouteManager;

public class BusRouteStarter {

	public static void main(String[] args) {
		
		BusRouteDAO DAO = new BusRouteManager();
		DAO.save(null);
		//DAO.findByDestination(null);
		//DAO.displayDetails();
		
		
//		BusRouteManager busRouteManager = new BusRouteManager();
//		
//		busRouteManager.BusRouteDAO();		
//		busRouteManager.save(null);
//		busRouteManager.findByDestination(null);
//		busRouteManager.displayDetails();
	}

}
