package LibraryPack;

public class Dissertations extends Items {

	private String institusion;
	
	public Dissertations() {
		// TODO Auto-generated constructor stub
	}

	public Dissertations(int itemID, String itemName, String itemType, int noOfPages, boolean checkedIn, String institusion) {
		super(itemID, itemName, itemType, noOfPages, checkedIn);
		this.institusion = institusion;
	}
	
	@Override
	public String toString() {
		return super.toString() + "| Institusion: " + institusion;
	}

	public String getInstitusion() {
		return institusion;
	}

	public void setInstitusion(String institusion) {
		this.institusion = institusion;
	}

}
