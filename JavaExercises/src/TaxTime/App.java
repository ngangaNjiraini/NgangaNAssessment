
package TaxTime;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax taxes = new Tax();
		int salary = 100000;
		System.out.println("Tax Bracket for Salary £" + salary + "\n-> " + taxes.salaryTax(salary) + "%");
		System.out.println("Tax Payment for Salary £" + salary + "\n-> £" + taxes.exactTax(salary));
	}

}
