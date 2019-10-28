package Garage;

import java.util.ArrayList;
import java.util.List;

import PaintPack.Paint;

public class Garage {
	private List<Vehicle> vehicles = new ArrayList<>();
	
	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle); 
	}

	public boolean removeVehicle(Vehicle vehicle) {
		return this.vehicles.remove(vehicle);
	}
	
	public void printVehicle() {
		for (Vehicle v : vehicles) { System.out.println(v); }
	}
	
	public int fixVehicle(Vehicle vehicle) {
		int bill = 0;
		if (vehicle instanceof Car) {
			if (vehicle.getWeight() >= 1500) {
				bill += 500;
			} else if (vehicle.getNoOfWheels() < 4) {
				bill += 300;
			} else {
				bill += 250;
			}
			return bill;
			
		} else if (vehicle instanceof Motorbike) {
			if (vehicle.getWeight() >= 500) {
				bill += 255;
			} else if (((Motorbike) vehicle).isHasHandleBar() == false) {
				bill += 700;
			} else {
				bill += 250;
			}
			
			return bill;
		} else if (vehicle instanceof Lorry) {
			if (vehicle.getWeight() >= 11000) {
				bill += 25000;
			} else if (vehicle.getNoOfWheels() < 8) {
				bill += 19500;
			} else if (((Lorry) vehicle).isHasCarriage() == true){
				bill += 55000;
			}

			return bill;
		} else {
			bill += 500;
			return bill;
		}
	}
}
