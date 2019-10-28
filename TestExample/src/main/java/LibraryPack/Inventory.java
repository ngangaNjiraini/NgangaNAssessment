package LibraryPack;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	private ArrayList<Items> itemList = new ArrayList();

	public Inventory() {
	}

	

	public boolean addItem(Items item) {
		return this.itemList.add(item);
	}

	public boolean removeItem(Items item) {
		return this.itemList.remove(item);
	}
	
	public void printItems() {
		for (Items i : itemList) { System.out.println(i); }
	}

	public void updateItem() {
		//Scanner sc = new Scanner(System.in);
		
	}
	
	public ArrayList<Items> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<Items> itemList) {
		this.itemList = itemList;
	}
}
