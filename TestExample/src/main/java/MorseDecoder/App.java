package MorseDecoder;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		Translator translator = new Translator();
		
		dictionary.setupDictionary();
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------\nYour Message: ");
		String message = scan.nextLine();
		
		translator.translate(message, dictionary);
	}

}
