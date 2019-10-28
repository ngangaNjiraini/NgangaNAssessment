package HelloPackage;

public class Calculator {
	
	public int add(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
	
	public int multiply(int num1, int num2) {
		int total = num1 * num2;
		return total;
	}
	
	public int subtract(int num1, int num2) {
		int total = num1 - num2;
		return total;
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
