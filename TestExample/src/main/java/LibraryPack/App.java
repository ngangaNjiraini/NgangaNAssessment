package LibraryPack;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random rand = new Random();
		Library library = new Library();
		Items nickelBoy = new Books(rand.nextInt(100), "The Nickel Boys", "Book", 224, true, "Historical Fiction", "Colson Whitehead");
		Items wired = new Magazines(rand.nextInt(100), "Wired", "Magazine", 120, true, "Condé Nast");
		Items eFashion = new Dissertations(rand.nextInt(100), "E-Commerce in Fashion", "Dissertation", 21, true, "University of Lancaster");
		Items treasureReport = new Magazines(rand.nextInt(100), "Reporting Treasure", "Government Docs", 4, true, "British Museum Treasure Registry");
		
		Inventory inventory = new Inventory();
		inventory.addItem(nickelBoy);
		inventory.addItem(wired);
		inventory.addItem(eFashion);
		inventory.addItem(treasureReport);
		
		library.runLibrary(inventory);
	}

}
