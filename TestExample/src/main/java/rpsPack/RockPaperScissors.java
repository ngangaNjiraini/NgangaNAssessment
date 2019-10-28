package rpsPack;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private String result;
	private boolean playing = true;

	public RockPaperScissors() {
	}

	public RockPaperScissors(String result, boolean playing) {
		super();
		this.result = result;
		this.playing = playing;
	}

	public void runGame(Player player, CPU cpu) {
		int noOfGames = 0;
		int draws = 0;

		Scanner scan = new Scanner(System.in);

		while (playing != false || noOfGames == 10) {
			noOfGames++;
			try {
				System.out.println("-----------\nYour Move: ");
				player.setPlayerMove(scan.nextLine());
			} catch (Exception e) {
				System.out.println(e);
			}

			System.out.println("Player: " + player.getPlayerMove());
			result = cpu.compareMove(player.getPlayerMove());
			System.out.println(result);

			switch (result) {
			case "YOU WIN":
				player.setPlayerWins(player.getPlayerWins() + 1);
				break;
			case "YOU LOSE":
				cpu.setCpuWins(cpu.getCpuWins() + 1);
				break;
			case "DRAW":
				draws++;
			}

			try {
				System.out.println("-----------\nPlay Again?(Yes | No): ");
				String playerChoice = scan.nextLine();
				playing = playAgain(playerChoice);

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		
		winRates(player.getPlayerWins(), cpu.getCpuWins(), draws, noOfGames);
		scan.close();
	}

	public boolean playAgain(String choice) {

		if (choice.equals("Yes")) {
			playing = true;
		} else if (choice.equals("No")) {
			System.out.println("Game Over\n-------------");
			playing = false;
		}

		return playing;
	}

	public void winRates(int players, int cpus, int draws, int games) {
		float playerPercent = (players * 100) / games;
		float cpuPercent = (cpus * 100) / games;
		float drawPercent = (draws * 100) / games;

		System.out.println("No Of Games: " + games + "\nPlayer Winrate: " + players + " (" + playerPercent + "%)"
				+ "\nCPU Winrate: " + cpus + " (" + cpuPercent + "%)" + "\nDraws: " + draws + " (" + drawPercent
				+ "%)");
	}
}
