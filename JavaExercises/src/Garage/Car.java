package Garage;

public class Car extends Vehicle {
	
	private boolean hasRoof;
	
	public Car() {}

	public Car(String name, String colour, int noOfWheels, int weight, int power) {
		super(name, colour, noOfWheels, weight, power);
		this.hasRoof = hasRoof;
	}


	public boolean isHasRoof() {
		return hasRoof;
	}


	public void setHasRoof(boolean hasRoof) {
		this.hasRoof = hasRoof;
	}
	
	
}
