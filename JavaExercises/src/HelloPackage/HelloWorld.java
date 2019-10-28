package HelloPackage;

public class HelloWorld {

	public static void main(String[] args) {
		mathTime(5,10);
	}
	
	public static int mathTime(int num1, int num2) {
		while (num1 != num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		System.out.println(num2);
		return num2;
	}

}
