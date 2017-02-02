package com.dhiva.Mocks;

//http://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html

public class AirCraft {
	int id;
	String carrierName;
	Type type;
	Size size;

	public enum Type {
		PASSENGER(25), CARGO(10);
		int type;

		Type(int type) {
			this.type = type;
		}
		
		public int getType() {
			return this.type;
		}
	}

	public enum Size {
		LARGE(15), SMALL(5);
		int size;

		Size(int size) {
			this.size = size;
		}
		
		public int getSize() {
			return this.size;
		}
	}

	public AirCraft(int id, String carrierName, String type, String size) {
		this.id = id;
		this.carrierName = carrierName;
		if (type == "PASSENGER")
			setType(25);
		else
			setType(10);
		if (size == "LARGE")
			setSize(15);
		else
			setSize(5);
	}

	private void setSize(int size) {
		for (Size b : Size.values()) {
			if (size == b.size) {
				this.size = b;

			}
		}
	}

	private void setType(int type) {
		for (Type b : Type.values()) {
			if (type == b.type) {
				this.type = b;

			}
		}
	}

//	public String getType() {
//		return this.type.toString();
//	}

//	public String getSize() {
//		return this.size.toString();
//	}

	public String getName() {
		return this.carrierName;
	}
}
