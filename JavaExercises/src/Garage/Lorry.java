package Garage;

public class Lorry extends Vehicle{
	
	private boolean hasCarriage;
	
	public Lorry() {}

	public Lorry(String name, String colour, int noOfWheels, int weight, int power) {
		super(name, colour, noOfWheels, weight, power);
		// TODO Auto-generated constructor stub
		this.hasCarriage = hasCarriage;
	}

	public boolean isHasCarriage() {
		return hasCarriage;
	}

	public void setHasCarriage(boolean hasCarriage) {
		this.hasCarriage = hasCarriage;
	}

}
