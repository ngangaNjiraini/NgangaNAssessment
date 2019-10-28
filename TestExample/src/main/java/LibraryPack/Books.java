package LibraryPack;

public class Books extends Items{
	private String genre; 
	private String author;
	
	public Books() {}

	public Books(int itemID, String itemName, String itemType, int noOfPages, boolean checkedIn, String genre, String author) {
		super(itemID, itemName, itemType, noOfPages, checkedIn);
		this.genre = genre;
		this.author = author;
	}

	
	@Override
	public String toString() {
		return super.toString() + " | Genre: " + genre + " | Author: " + author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
