package com.dhiva.Mocks;

public class AirCraft {
	 int id;
	 String carrierName;
	String type;
	 String size;

	AirCraft(int id, String carrierName, String type, String size) {
		this.id = id;
		this.carrierName = carrierName;
		this.type = type;
		this.size = size;
	}
	
	public String getName(){
		return this.carrierName;
	}
}
