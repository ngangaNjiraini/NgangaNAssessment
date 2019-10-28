package rpsPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	private String playerMove;
	private int playerWins = 0;
	private List<String> moveList = new ArrayList<String>();

	public Player() {
	}

	public Player(String playerMove, int playerWins) {
		super();
		this.playerMove = playerMove;
		this.playerWins = playerWins;
	}

	public String getPlayerMove() {
		return playerMove;
	}

	public void setPlayerMove(String playerMove) {
		this.playerMove = playerMove;
	}

	public int getPlayerWins() {
		return playerWins;
	}

	public void setPlayerWins(int playerWins) {
		this.playerWins = playerWins;
	}

}
