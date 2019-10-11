package TheSwamp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	boolean gameState = true;
	Player player = new Player();

	public Game() {
	}

	public Game(boolean gameState) {
		super();
		this.gameState = gameState;
		player.setPlayerX(0);
		player.setPlayerY(0);
	}

	public void gameLoop(Compass compass) {
		String foundItem = null;
		boolean found = false;
		Scanner s = new Scanner(System.in);

		while (gameState != false) {
			System.out.println("-------------\nPick a Direction (North|East|South|West): ");
			String bearing = s.nextLine();

			if (!bearing.equals("North") && !bearing.equals("East") && !bearing.equals("South")
					&& !bearing.equals("West")) {
				System.out.println("You Cannot Continue. Enter a valid direction");
			} else {
				playerMove(bearing);

				foundItem = checkMap(compass.getTreasures());
				if (!foundItem.isEmpty()) {
					found = true;
				}
			}

			if (found == true) {
				System.out.println("\nThis your ticket out...\nWell Done!"
						+ "\n-------------------------------------------------"
						+ "\n----Your Still Stuck in the Swamp though LMAO----"
						+ "\n-------------------------------------------------");
				gameState = false;
			}
		}
		
		s.close();

	}

	public void playerMove(String direction) {
		if (direction.equals("North")) {
			player.setPlayerY(player.getPlayerY() + 1);

		} else if (direction.equals("South")) {
			player.setPlayerY(player.getPlayerY() - 1);

		} else if (direction.equals("East")) {
			player.setPlayerX(player.getPlayerX() + 1);

		} else if (direction.equals("West")) {
			player.setPlayerX(player.getPlayerX() - 1);
		}
	}

	public String checkMap(List<Treasure> treasure) {
		int differenceX = 0;
		int differenceY = 0;
		String foundItem = "";
		for (Treasure t : treasure) {
			if (t.getPosX() != player.getPlayerX() && t.getPosY() != player.getPlayerY()) {

				if (t.getPosX() < player.getPlayerX()) {
					differenceX = t.getPosX() - player.getPlayerX();
				} else {
					differenceX = player.getPlayerX() - t.getPosX();
				}

				if (t.getPosY() < player.getPlayerY()) {
					differenceY = t.getPosY() - player.getPlayerY();
				} else {
					differenceY = player.getPlayerY() - t.getPosY();
				}

				double nearest = Math.hypot(differenceX, differenceY);
				System.out.println("----------\nThe Compass reads: " + Math.round(nearest) + "m...");
			} else {
				System.out.println("\nYou see something in the distance.... \nYou've Found " + t.getName());
				foundItem = t.getName();
				break;
			}
		}

		return foundItem;
	}

	// Function to remove treasures once found
	
	// public void removeTreasure(List<Treasure> treasure, String itemName) {
	// for (Treasure t : treasure) {
	// if (t.getName().equals(itemName)){
	// treasure.remove(t);
	// }
	// }
	// }
}
