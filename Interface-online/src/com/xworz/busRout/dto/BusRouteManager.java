package com.xworz.busRout.dto;

public class BusRouteManager implements BusRouteDAO {

	
	
	
	@Override
	public void BusRouteDAO() {
		System.out.println("innoked no-org from BusRouteManger class");
	}

	@Override
	public void save(BusRoutDTO dto) {
		System.out.println("invoked save");

	}

	@Override
	public void findByDestination(String name) {
		System.out.println("invoked findByDestination ");

	}

	@Override
	public void displayDetails() {

		System.out.println("invoked displayDetails ");

	}

}
