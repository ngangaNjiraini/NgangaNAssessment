package LibraryPack;

public class Magazines extends Items {

	private String publication;
	
	public Magazines() {
		// TODO Auto-generated constructor stub
	}

	public Magazines(int itemID, String itemName, String itemType, int noOfPages, boolean checkedIn, String publication) {
		super(itemID, itemName, itemType, noOfPages, checkedIn);
		this.publication = publication;
	}
	
	@Override
	public String toString() {
		return super.toString() + "| Publication: " + publication;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
	

}
