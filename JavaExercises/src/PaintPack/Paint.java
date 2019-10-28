package PaintPack;

public class Paint {
	private String paintName;
	private int paintLitres;
	private double paintCost;
	private int coverage;
	
	public Paint() {}

	public Paint(String paintName, int paintLitres, double paintCost, int coverage) {
		super();
		this.paintName = paintName;
		this.paintLitres = paintLitres;
		this.paintCost = paintCost;
		this.coverage = coverage;
	}

	@Override
	public String toString() {
		return paintName + " (" + paintLitres + " Litres) £" + paintCost + "\n  This tin of paint will cover "+ coverage + "m\u00B2 per Litre";
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	
	public String getPaintName() {
		return paintName;
	}

	public void setPaintName(String paintName) {
		this.paintName = paintName;
	}

	public int getPaintLitres() {
		return paintLitres;
	}

	public void setPaintLitres(int paintLitres) {
		this.paintLitres = paintLitres;
	}

	public double getPaintCost() {
		return paintCost;
	}

	public void setPaintCost(int paintCost) {
		this.paintCost = paintCost;
	}
}
