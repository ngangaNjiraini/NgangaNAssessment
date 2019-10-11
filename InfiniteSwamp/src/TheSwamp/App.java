package TheSwamp;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		Game game = new Game();
		
		Random randPos = new Random();
		
		Treasure treasure1 = new Treasure("Sonic Adventure 2 Battle for the Nintendo Gamecube", randPos.nextInt(15 + 5) - 15, randPos.nextInt(15 + 4) - 15);
		Treasure treasure2 = new Treasure("Another Swamp", randPos.nextInt(15 +  5) - 15, randPos.nextInt(15 + 5) - 15);
		Treasure treasure3 = new Treasure("Your Keys...", randPos.nextInt(15 + 5) - 10, randPos.nextInt(10 + 5) - 15);
		Treasure treasure4 = new Treasure("The Answer to the Universe...", randPos.nextInt(15 + 5) - 15, randPos.nextInt(15 + 5) - 15);
		
		Compass compass = new Compass();
		compass.addTreasure(treasure1);
		compass.addTreasure(treasure2);
		compass.addTreasure(treasure3);
		compass.addTreasure(treasure4);
		
		System.out.println("Your eyes begin to clear, or so you thought."
				+ "\nThe dense fog surrounds you as though trying to trap you from forever leaving."
				+ "\nEndless swamp encompasses your vision from every angle."
				+ "\nYour only companion, it seems, is a small device left in you hands from an unknown source."
				+ "\nThe device reads only your bearing, and a distance." + "\nYou Continue Forward.");
		game.gameLoop(compass);
		
	}

}
