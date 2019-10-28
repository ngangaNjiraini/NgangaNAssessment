package DivisionPack;


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum1 = 0;
		int userNum2 = 0;
		double total = 0;
		boolean validIn = true;
		Division maths = new Division();

		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("-----------\nEnter First Number: ");
				userNum1 = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Second Number: ");
				userNum2 = Integer.parseInt(sc.nextLine());
				total = maths.divide(userNum1, userNum2);
				System.out.println("Total: " + total);
				validIn = true;
			} catch (NumberFormatException ime) {
				System.out.println("Incorrect Input: " + ime);
				validIn = false;
			} catch (Exception e) {
				System.out.println(e);
				validIn = false;
			} 
		} while (!validIn);

		sc.close();
	}

}
