package com.xworz.busRout.dto;

public class BusRoutDTO {

	public int id;
	public String startPoint;
	public String destination;
	public String driverName;

	public BusRoutDTO() {
		System.out.println("invoked no-org cons..");
	}

	public BusRoutDTO(int id, String startPoint, String destination, String driverName) {
		this.id = id;
		this.startPoint = startPoint;
		this.destination = destination;
		this.driverName = driverName;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "BusRoutDTO [id=" + id + ", startPoint=" + startPoint + ", destination=" + destination + ", driverName="
				+ driverName + "]";
	}

}
