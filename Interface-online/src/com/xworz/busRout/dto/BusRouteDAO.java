package com.xworz.busRout.dto;

public interface BusRouteDAO {
	
	 BusRoutDTO[] cont= new BusRoutDTO[20]; 
	 int bus=0;
	
	
	public default void BusRouteDAO() {
		System.out.println("invoked no-org con.. from BusRouteDAO");
		
	}
	
	public default void save(BusRoutDTO dto) {
		System.out.println("invoked save....");
		
		
		
	}
	
	public void findByDestination(String name);
	
	public void displayDetails();
	

}
