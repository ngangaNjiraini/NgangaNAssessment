package Garage;

public abstract class Vehicle {
	String name;
	String colour;
	int noOfWheels;
	int weight;
	int power;
	
	public Vehicle() {}
	
	public Vehicle(String name, String colour, int noOfWheels, int weight, int power) {
		super();
		this.name = name;
		this.colour = colour;
		this.noOfWheels = noOfWheels;
		this.weight = weight;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", colour=" + colour + ", noOfWheels=" + noOfWheels + ", weight=" + weight
				+ ", power=" + power + "]";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
