package TaxTime;

public class Tax {

	private int taxPercent = 0;

	public int salaryTax(int salary) {
		if (salary <= 14999) {
			taxPercent = 0;
		} else if (salary >= 15000 && salary <= 19999) {
			taxPercent = 10;
		} else if (salary >= 20000 && salary <= 29999) {
			taxPercent = 15;
		} else if (salary >= 30000 && salary <= 44999) {
			taxPercent = 20;
		} else {
			taxPercent = 25;
		}
		return taxPercent;
	}

	public float exactTax(int salary) {
		taxPercent = salaryTax(salary);
		float totalTax = salary * (float) taxPercent / 100;
		
		return totalTax;
	}
}
