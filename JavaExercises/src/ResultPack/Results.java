package ResultPack;

public class Results {

	public void examResults(int physics, int chemisty, int biology) {
		System.out.println("-------------Exam Results------------- \nMarks--> ");
		System.out.println("	Physics: " + physics);
		System.out.println("	Chemisty: " + chemisty);
		System.out.println("	Biology: " + biology);
	}

	public void totalPercent(int physics, int chemisty, int biology) {
		int total = 0;
		float phyPercent = 0;
		float chemPercent = 0;
		float bioPercent = 0;
		float overall = 0;

		total = physics + chemisty + biology;
		System.out.println("------> Total Marks: " + total);
		phyPercent = (physics * 100) / 150;
		chemPercent = (chemisty * 100) / 150;
		bioPercent = (biology * 100) / 150;
		overall = (total * 100) / 450;

		System.out.println("\nPercents-->\n	Physics: " + phyPercent + "%");
		System.out.println("	Chemisty: " + chemPercent + "%");
		System.out.println("	Biology: " + bioPercent + "%");

		if (overall < 60) {
			System.out.println("------> OVERALL PERCENTAGE: " + overall + "%");
			System.out.println("FAIL: Overall marks are below Pass Rate(60%)");
		} else if (phyPercent >= 60 && chemPercent >= 60 && bioPercent >= 60) {
			System.out.println("------> OVERALL PERCENTAGE: " + overall + "%");
			System.out.println("PASS: Well done!");
		} else {
			System.out.println("------> OVERALL PERCENTAGE: " + overall + "%");
			System.out.println("FAIL: Did not pass 1 or more exams.");
		}

	}
}
