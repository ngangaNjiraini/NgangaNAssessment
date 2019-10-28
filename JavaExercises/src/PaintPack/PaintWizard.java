package PaintPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PaintWizard {
	private List<Paint> paints = new ArrayList<>();
	
	public PaintWizard(Paint... paints) {
		this.paints = Arrays.asList(paints);
	}
	
	public boolean addPaint(Paint paint) {
		return this.paints.add(paint); 
	}

	public boolean removePaint(Paint paint) {
		return this.paints.remove(paint);
	}
	
	public void printPaints() {
		for (Paint p : paints) { System.out.println(p); }
	}
	
	public void leastWaste(int roomSize) {
		int totalRoomCoverage = 0;
		
		double least = 0;
		for (Paint p : paints) {
			totalRoomCoverage = p.getPaintLitres() * p.getCoverage();
			
			double paintUsed = ((double) roomSize/  (double) totalRoomCoverage) * 100;
			double remainPaint = 100 - Math.round(paintUsed);
			
			if (remainPaint < least) {
				least = remainPaint;
			}
		}
	}
	
	public void cheapestPaint(int roomSize) {
		
	}
}
