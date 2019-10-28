package LibraryTest;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import LibraryPack.App;
import LibraryPack.Books;
import LibraryPack.Dissertations;
import LibraryPack.Inventory;
import LibraryPack.Items;
import LibraryPack.Library;
import LibraryPack.Magazines;

public class LibraryTest {

	private Random rand = new Random();
	private Library library = new Library();
	private Items nickelBoy = new Books(rand.nextInt(100), "The Nickel Boys", "Book", 224, true, "Historical Fiction", "Colson Whitehead");
	private Items wired = new Magazines(rand.nextInt(100), "Wired", "Magazine", 120, true, "Condé Nast");
	private Items eFashion = new Dissertations(rand.nextInt(100), "E-Commerce in Fashion", "Dissertation", 21, true, "University of Lancaster");
	private Items treasureReport = new Magazines(rand.nextInt(100), "Reporting Treasure", "Government Docs", 12, true, "British Museum Treasure Registry");
	
	Inventory inventory = new Inventory();

	
	@Test
	public void addItemsToList() {
		assertEquals("Item not added", true, inventory.addItem(nickelBoy));
		
	}

}
