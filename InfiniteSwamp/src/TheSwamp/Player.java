package TheSwamp;

import java.lang.reflect.Array;

public class Player {
	private int playerX = 0;
	private int playerY = 0;
	
	public Player() {}

	public Player(int playerX, int playerY) {
		super();
		this.playerX = playerX;
		this.playerY = playerY;
	}

	public int getPlayerX() {
		return playerX;
	}

	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public int getPlayerY() {
		return playerY;
	}

	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}

}
