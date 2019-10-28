package Garage;

public class Motorbike extends Vehicle{
	
	private boolean hasHandleBar;
	
	public Motorbike() {}

	public Motorbike(String name, String colour, int noOfWheels, int weight, int power) {
		super(name, colour, noOfWheels, weight, power);
		this.hasHandleBar = hasHandleBar;
	}

	public boolean isHasHandleBar() {
		return hasHandleBar;
	}

	public void setHasHandleBar(boolean hasHandleBar) {
		this.hasHandleBar = hasHandleBar;
	}
	
	
}
