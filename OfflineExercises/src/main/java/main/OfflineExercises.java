package main;

import java.util.ArrayList;
import java.util.List;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String newString = "";
		for (int i = 0; i < input.length(); i++) {
			char temp = input.charAt(i);

			for (int j = 0; j < 3; j++) {
				newString = newString + temp;
			}

		}
		return newString;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String bertCheck = input.toLowerCase();
		StringBuilder inputFlip = new StringBuilder();

		int startBert = bertCheck.indexOf("bert") + 4;
		int endBert = bertCheck.lastIndexOf("bert");

		try {
			if (endBert != 0) {
				String toFlip = input.substring(startBert, endBert);
				inputFlip.append(toFlip);
				return inputFlip.reverse().toString();
			} else {
				return "";
			}

		} catch (StringIndexOutOfBoundsException s) {
			return "";
		}

	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int small = 0;
		int medium = 0;
		int large = 0;
		
		if (a < b && a < c) {
			small = a;
		} else if ((a > b && a < c) || (a < b && a > c)) {
			medium = a;
		} else if (a > b && a > c){
			large = a;
		}
		
		if (b < a && b < c) {
			small = b;
		} else if ((b > a && b < c) || (b < a && b > c)) {
			medium = b;
		} else if (b > a && b > c){
			large = b;
		}
		
		if (c < a && c < b) {
			small = c;
		} else if ((c > a && c < b) || (c < a && c > b)) {
			medium = c;
		} else if (c > a && c > b){
			large = c;
		}
		
		System.out.println(small + " " + medium + " " + large);
		
		int dif1 = small - medium;
		int dif2 = medium - large;
		
		if (dif1 == dif2) {
			return true;
		} else {
			return false;
		}
		
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if (input.endsWith("Dev") || input.endsWith("dev")) {
			return true;
		} else {
			return false;
		}

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int repeats = 0;
		int maxRepeats = 0;

		for (int i = 0; i < input.length(); i++) {
			try {
				char temp1 = input.charAt(i);
				char temp2 = input.charAt(i + 1);
				if (temp1 == temp2) {
					repeats++;
				} else {
					repeats = 1;
				}
			} catch (StringIndexOutOfBoundsException s) {
				break;
			}

			if (repeats > maxRepeats) {
				maxRepeats = repeats;
			}
		}
		return maxRepeats;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int counter = 0;
		String[] wordList = arg1.split(" ");

		for (int i = 0; i < wordList.length; i++) {
			if (wordList[i].equals("am") || wordList[i].equals("Am")) {
				counter++;
			}
		}

		return counter;
	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {

			return "fizzbuzz";
		} else if (arg1 % 5 == 0) {

			return "buzz";
		} else if (arg1 % 3 == 0) {

			return "fizz";
		} else {
			return "N/A";
		}
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		String[] intList = arg1.split(" ");
		int highest = 0;
		for (int i = 0; i < intList.length; i++) {
			int intValue = Integer.parseInt(intList[i]);
			int num1 = intValue / 100;

			int num2 = intValue / 10;
			int num2Split = num2 % 10;

			int num3 = intValue % 10;

			int total = 0;
			if (intList[i].length() == 3) {
				total = num1 + num2Split + num3;
			} else {
				total = num2Split + num3;
			}

			if (total > highest) {
				highest = total;
			}
		}

		return highest;
	}

}
