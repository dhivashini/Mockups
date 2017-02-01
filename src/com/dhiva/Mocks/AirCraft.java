package com.dhiva.Mocks;

public class AirCraft {
	int id;
	String carrierName;
	Type type;
	Size size;

	public enum Type {
		PASSENGER("PASSENGER"), CARGO("CARGO");
		String type;

		Type(String type) {
			this.type = type;
		}
	}

	public enum Size {
		LARGE("LARGE"), SMALL("SMALL");
		String size;

		Size(String size) {
			this.size = size;
		}
	}

	AirCraft(int id, String carrierName, Type type, Size size) {
		this.id = id;
		this.carrierName = carrierName;
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return this.type.toString();
	}

	public String getSize() {
		return this.size.toString();
	}

	public String getName() {
		return this.carrierName;
	}
}
