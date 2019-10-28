package MorseDecoder;

import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> morseDictionary = new HashMap<String, String>();
	
	public Dictionary() {
	}
	
	public void setupDictionary() {
		morseDictionary.put(".-","A");
		morseDictionary.put("-...","B");
		morseDictionary.put("-.-.", "C");
		morseDictionary.put("-..", "D");
		morseDictionary.put(".", "E");
		morseDictionary.put("..-.", "F");
		morseDictionary.put("--.", "G");
		morseDictionary.put("....", "H");
		morseDictionary.put("..", "I");
		morseDictionary.put(".---", "J");
		morseDictionary.put("-.-", "K");
		morseDictionary.put(".-..", "L");
		morseDictionary.put("--", "M");
		morseDictionary.put("-.", "N");
		morseDictionary.put("---", "O");
		morseDictionary.put(".--.", "P");
		morseDictionary.put("--.-", "Q");
		morseDictionary.put(".-.", "R");
		morseDictionary.put("...", "S");
		morseDictionary.put("-", "T");
		morseDictionary.put("..-", "U");
		morseDictionary.put("...-", "V");
		morseDictionary.put(".--", "W");
		morseDictionary.put("-..-", "X");
		morseDictionary.put("-.--", "Y");
		morseDictionary.put("--..", "Z");
		morseDictionary.put("/", " ");
	}
	
	public String findLetter(String code) {
		return morseDictionary.get(code);
	}

	public HashMap<String, String> getMorseDictionary() {
		return morseDictionary;
	}

	public void setMorseDictionary(HashMap<String, String> morseDictionary) {
		this.morseDictionary = morseDictionary;
	}
	
}
