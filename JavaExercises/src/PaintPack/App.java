package PaintPack;

public class App {

	public static void main(String[] args) {
		
		PaintWizard wizPaint = new PaintWizard(new Paint("CheapoMax", 21, 19.99, 10),
											   new Paint("ThatOneWithTheDog", 40, 34.38, 12), 
											   new Paint("AverageJoes", 16, 17.99, 11),
											   new Paint("DuluxourousPaints", 10, 25.00, 22));
		
		wizPaint.printPaints();
		//wizPaint.leastWaste(200);
	}

}
