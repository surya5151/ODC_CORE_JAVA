package com.xworkz.abstraction.starter;

import com.xworkz.abstraction.GoaTravelPlane;
import com.xworkz.abstraction.TravelPlane;

public class TravelPlaneStarter {
	public static void main(String[] args) {

		TravelPlane travel = new GoaTravelPlane();
		
		
		travel.travelToGoa(10, 25000);
		travel.travelToAmerica();
	}

}
