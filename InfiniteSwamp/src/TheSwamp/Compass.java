package TheSwamp;

import java.util.ArrayList;
import java.util.List;


public class Compass {
	private List<Treasure> treasures = new ArrayList<>();
	
	public Compass() {}

	public Compass(List<Treasure> treasures) {
		super();
		this.treasures = treasures;
	}

	public boolean addTreasure(Treasure treasure) {
		return this.treasures.add(treasure);
	}


	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

}
