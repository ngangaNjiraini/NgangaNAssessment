package LibraryPack;

public class GovernDocs extends Items {

	private String department;
	
	public GovernDocs() {
		// TODO Auto-generated constructor stub
	}

	public GovernDocs(int itemID, String itemName, String itemType, int noOfPages, boolean checkedIn, String department) {
		super(itemID, itemName, itemType, noOfPages, checkedIn);
		this.department = department;
	}
	
	@Override
	public String toString() {
		return super.toString() + "| Department: " + department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
