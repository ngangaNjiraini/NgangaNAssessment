package LibraryPack;

import java.util.Random;
import java.util.Scanner;

public class Library {
	private boolean libState = true;
	private boolean inventoryState = true;
	Random rand = new Random();

	public Library() {
	}

	public Library(boolean libState) {
		super();
		this.libState = libState;
	}

	public void runLibrary(Inventory inventoryList) {

		Scanner sc = new Scanner(System.in);

		while (libState != false) {

			System.out.println("\nWelcome to the QA Library." + "\n---------------------------------"
					+ "\nWhat would you like to do? (Check Inventory || Quit)");

			try {
				String userInput = sc.nextLine();
				if (userInput.equals("Quit")) {
					System.out.println("-----------------\nGoodbye!");
					libState = false;

				} else if ("inventory".equalsIgnoreCase("Inventory")) {
					inventoryList.printItems();

					while (inventoryState != false) {
						System.out.println(
								"-----------------\nInventory Options (Add Item || Remove Item(By ID) || Update Item || Go Back): ");
						String inventoryInput = sc.nextLine();

						runInventory(inventoryInput, inventoryList, sc);
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		sc.close();
	}

	public void runInventory(String userInput, Inventory inventoryList, Scanner sc) {
		if (userInput.equals("Add Item") || userInput.equals("add")) {
			System.out.println("--------\nItem Type: ");
			String itemType = sc.nextLine();

			addItems(itemType, inventoryList, sc);
		} else if (userInput.equals("Remove Item") || userInput.equals("remove")) {
			System.out.println("--------\nEnter Item ID to remove: ");
			int idInput = Integer.parseInt(sc.nextLine());
			
			removeItems(idInput, inventoryList, sc);
		} else if (userInput.equals("Go Back")) {
			System.out.println("Returning...");
			inventoryState = false;
		}
	}

	public void addItems(String itemType, Inventory inventoryList, Scanner sc) {
		if ("book".equalsIgnoreCase("Book")) {
			System.out.println("Item Name: ");
			String bookName = sc.nextLine();

			System.out.println("Number of Pages: ");
			int pageNum = Integer.parseInt(sc.nextLine());

			System.out.println("Genre: ");
			String genreName = sc.nextLine();

			System.out.println("Author: ");
			String authorName = sc.nextLine();

			inventoryList
					.addItem(new Books(rand.nextInt(100), bookName, itemType, pageNum, true, genreName, authorName));
			inventoryList.printItems();
			inventoryState = true;

		} else if ("magazine".equalsIgnoreCase("Magazine")) {
			System.out.println("Item Name: ");
			String magName = sc.nextLine();

			System.out.println("Number of Pages: ");
			int pageNum = Integer.parseInt(sc.nextLine());

			System.out.println("Publication: ");
			String pubName = sc.nextLine();

			inventoryList.addItem(new Magazines(rand.nextInt(100), magName, itemType, pageNum, true, pubName));
			inventoryList.printItems();
			inventoryState = true;

		} else if ("dissertion".equalsIgnoreCase("Dissertion")) {
			System.out.println("Item Name: ");
			String disName = sc.nextLine();

			System.out.println("Number of Pages: ");
			int pageNum = Integer.parseInt(sc.nextLine());

			System.out.println("Publication: ");
			String instName = sc.nextLine();

			inventoryList.addItem(new Magazines(rand.nextInt(100), disName, itemType, pageNum, true, instName));
			inventoryList.printItems();
			inventoryState = true;

		} else if ("government doc".equalsIgnoreCase("Government Doc")) {
			System.out.println("Item Name: ");
			String docName = sc.nextLine();

			System.out.println("Number of Pages: ");
			int pageNum = Integer.parseInt(sc.nextLine());

			System.out.println("Department: ");
			String depName = sc.nextLine();

			inventoryList.addItem(new GovernDocs(rand.nextInt(100), docName, itemType, pageNum, true, depName));
			inventoryList.printItems();
			inventoryState = true;
		}
	}
	
	public void removeItems(int remove, Inventory inventoryList, Scanner sc) {
		boolean found = false;
		
		for (Items i :  inventoryList.getItemList()) {
			if (i.getItemID() == remove) {
				System.out.println("---------\nItem " + i.getItemName() + "(ID: " + i.getItemID() + ") Removed.");
				found = inventoryList.removeItem(i);
			} else {
				found = false;
			}
		}
		
		if (!found) {
			System.out.println("---> Item not Found (Invalid ID)");
		}
	}
}
