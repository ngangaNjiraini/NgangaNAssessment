package rpsPack;

public class App {

	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();

		RockPaperScissors rps = new RockPaperScissors();
		rps.runGame(player, cpu);
	}

}
