package TheSwamp;

public class Treasure {
	String name;
	int posX;
	int posY;
	
	public Treasure() {}

	public Treasure(String name, int posX, int posY) {
		super();
		this.name = name;
		this.posX = posX;
		this.posY = posY;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
