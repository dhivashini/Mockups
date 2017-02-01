package com.dhiva.Mocks;

//http://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html

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

	public AirCraft(int id, String carrierName, String type, String size) {
		this.id = id;
		this.carrierName = carrierName;
		setType(type);
		setSize(size);
	}

	private void setSize(String size) {
		for (Size b : Size.values()) {
			if (size.equalsIgnoreCase(b.size)) {
				this.size = b;

			}
		}
	}

	private void setType(String type) {
		for (Type b : Type.values()) {
			if (type.equalsIgnoreCase(b.type)) {
				this.type = b;

			}
		}
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
