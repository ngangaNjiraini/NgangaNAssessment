package StreamPack;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public Loops() {
	}

	public void findMin(List<Integer> numList) {
		int minValue = numList.get(0);
		for (int num : numList) {
			if (num < minValue) {
				minValue = num;
			}
		}

		System.out.println("Min Value(Loops): " + minValue);
	}

	public void findMax(List<Integer> numList) {
		int maxValue = numList.get(0);
		for (int num : numList) {
			if (num > maxValue) {
				maxValue = num;
			}
		}

		System.out.println("\nMax Value(Loops): " + maxValue);
	}

	public void removeOdd(List<Integer> numList) {
		List<Integer> evenList = new ArrayList<>();

		for (int i : numList) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}

		System.out.println("\nOdd Numbers Removed(Loops): ");
		for (int x : evenList) {
			System.out.println(x);
		}
	}
	
	public void removeEven(List<Integer> numList) {
		List<Integer> oddList = new ArrayList<>();

		for (int i : numList) {
			if (i % 2 == 1) {
				oddList.add(i);
			}
		}

		System.out.println("\nEven Numbers Removed(Loops): ");
		for (int x : oddList) {
			System.out.println(x);
		}
	}
	
	public void sumList(List<Integer> numList) {
		int total = 0;

		for (int i : numList) {
			total += i;
		}

		System.out.println("\nTotal Sum(Loops): " + total);
	}
	
	public void squareList(List<Integer> numList) {
		List<Integer> squaredList = new ArrayList<>();
		List<Integer> evensList = new ArrayList<>();
		for (int i : numList) {
			i = i*i;
			squaredList.add(i);
			
		}
		
		for (int j : squaredList) {
			j = j*j;
			evensList.add(j);
			
		}

		System.out.println("Odd Numbers Removed(Loops): ");
		for (int x : evensList) {
			System.out.println(x);
		}
	}
}
