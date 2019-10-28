package Garage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle RX7 = new Car("Mazda RX7","Orange", 4, 1250, 250);
		Vehicle FZS = new Motorbike("Yamaha FZ-S","Black", 2, 790, 170);
		
		Garage garage1 = new Garage();
		garage1.addVehicle(RX7);
		garage1.addVehicle(FZS);
		
		garage1.printVehicle();

	}

}
