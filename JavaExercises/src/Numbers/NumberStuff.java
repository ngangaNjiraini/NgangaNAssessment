package Numbers;

public class NumberStuff {
	public void numSplit(int number) {

		int num1 = number / 10;
		int num2 = number % 10;

		int newTotal = num1 + num2;
		System.out.println(newTotal);
	}

	public void numToString(int number) {
		String[] digits = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String[] elevens = { "Eleven", "Twelve"};
		String[] tens = { "Zero", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
		int numLength = Integer.toString(number).length();

		String val1 = null;
		String val2 = null;

		if (numLength == 1) {
			switch (number) {
			case 0:
				System.out.println(digits[0]);
				break;
			case 1:
				System.out.println(digits[1]);
				break;
			case 2:
				System.out.println(digits[2]);
				break;
			case 3:
				System.out.println(digits[3]);
				break;
			case 4:
				System.out.println(digits[4]);
				break;
			case 5:
				System.out.println(digits[5]);
				break;
			case 6:
				System.out.println(digits[6]);
				break;
			case 7:
				System.out.println(digits[7]);
				break;
			case 8:
				System.out.println(digits[8]);
				break;
			case 9:
				System.out.println(digits[9]);
				break;
			}

		} else if (numLength == 2) {
			int num1 = number / 10;
			int num2 = number % 10;
			if (number == 10) {
				System.out.println(tens[1]);

			} else if (number == 11) {
				System.out.println(elevens[0]);

			} else if (number == 12) {
				System.out.println(elevens[1]);

			} else if (num1 == 1) {
				switch (num2) {
				case 3:
					val1 = tens[3].substring(0, tens[3].length() - 1);
					System.out.println(val1 + "een");
					break;
				case 4:
					val1 = tens[4].substring(0, tens[4].length() - 1);
					System.out.println(val1 + "een");
					break;
				case 5:
					val1 = tens[5].substring(0, tens[5].length() - 1);
					System.out.println(val1 + "een");
					break;
				case 6:
					val1 = tens[6].substring(0, tens[6].length() - 1);
					System.out.println(val1 + "een");
					break;
				case 7:
					val1 = tens[7].substring(0, tens[7].length() - 1);
					System.out.println(val1 + "een");
					break;
				case 8:
					val1 = tens[8].substring(0, tens[8].length() - 1);
					System.out.println(val1 + "een");
					break;
				case 9:
					val1 = tens[9].substring(0, tens[9].length() - 1);
					System.out.println(val1 + "een");
					break;
				}

			} else {
				switch (num1) {
				case 2:
					val1 = tens[2];
					break;
				case 3:
					val1 = tens[3];
					break;
				case 4:
					val1 = tens[4];
					break;
				case 5:
					val1 = tens[5];
					break;
				case 6:
					val1 = tens[6];
					break;
				case 7:
					val1 = tens[7];
					break;
				case 8:
					val1 = tens[8];
					break;
				case 9:
					val1 = tens[9];
					break;
				}

				if (num2 != 0) {
					switch (num2) {
					case 1:
						val2 = digits[1];
						break;
					case 2:
						val2 = digits[2];
						break;
					case 3:
						val2 = digits[3];
						break;
					case 4:
						val2 = digits[4];
						break;
					case 5:
						val2 = digits[5];
						break;
					case 6:
						val2 = digits[6];
						break;
					case 7:
						val2 = digits[7];
						break;
					case 8:
						val2 = digits[8];
						break;
					case 9:
						val2 = digits[9];
						break;
					}

					System.out.println(val1 + " " + val2);
				} else {
					System.out.println(val1);
				}

			}
		}
	}
}
