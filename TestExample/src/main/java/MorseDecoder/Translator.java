package MorseDecoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Translator {

	public Translator() {
	}
	
	public void translate(String message, Dictionary dictionary) {
		List<String> charList = new ArrayList(Stream.of(message.split(" ")).map (elem -> new String(elem)).collect(Collectors.toList()));
		
		for (String s: charList) {
			System.out.print(dictionary.findLetter(s));
		}
	}

}
