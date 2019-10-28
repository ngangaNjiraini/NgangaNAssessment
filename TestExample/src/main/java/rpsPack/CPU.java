package rpsPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CPU {
	private String[] rps = { "Rock", "Paper", "Scissors" };
	private Random rand = new Random();
	private int cpuWins = 0;
	private List<String> moveList = new ArrayList<String>();

	public CPU() {
	}

	public CPU(int cpuWins) {
		super();
		this.cpuWins = cpuWins;
	}

	public String compareMove(String playerMove) {
		String cpuMove = rps[rand.nextInt(2 + 1)];
		String result = null;
		
		System.out.println("CPU: " + cpuMove);
		
		switch (playerMove) {
		case "Rock":
			if (cpuMove.equals("Paper")) {
				result = "YOU LOSE";
			} else if (cpuMove.equals("Scissors")) {
				result = "YOU WIN";
			} else if (cpuMove.equals("Rock")) {
				result = "DRAW";
			}
			break;
			
		case "Paper":
			if (cpuMove.equals("Paper")) {
				result = "DRAW";
			} else if (cpuMove.equals("Scissors")) {
				result = "YOU LOSE";
			} else if (cpuMove.equals("Rock")) {
				result = "YOU WIN";
			}
			break;
			
		case "Scissors":
			if (cpuMove.equals("Paper")) {
				result = "YOU WIN";
			} else if (cpuMove.equals("Scissors")) {
				result = "DRAW";
			} else if (cpuMove.equals("Rock")) {
				result = "YOU LOSE";
			}
		}
		
		return result;
	}

	public int getCpuWins() {
		return cpuWins;
	}

	public void setCpuWins(int cpuWins) {
		this.cpuWins = cpuWins;
	}
	
}
