package DivisionPack;

public class Division {

	public Division() {
	}

	public double divide(int num1, int num2) {
		int total = 0;
		if (num1 < num2) {
			System.out.println("Invalid: First Number is less than Second number.");
		} else {
			total = num1 / num2;
		}
		
		return total;

	}
}
