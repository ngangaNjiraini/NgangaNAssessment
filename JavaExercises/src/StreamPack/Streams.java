package StreamPack;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
	public Streams() {}
	
	public void findMin(List<Integer> numList) {
		int min = numList.stream().reduce((acc, next) -> Math.min(acc, next)).get();
		System.out.println("\nMin Value(Streams): " + min);
	}
	
	public void findMax(List<Integer> numList) {
		int max = numList.stream().reduce((acc, next) -> Math.max(acc, next)).get();
		System.out.println("\nMax Value(Streams): " + max);
	}
	
	public void removeOdd(List<Integer> numList) {
		List<Integer> odds = numList.stream().filter(x -> x % 2== 0).collect(Collectors.toList());
		System.out.println("\nOdd Numbers Removed(Streams): ");
		for (int i:odds) {
			System.out.println(i);
		}
    } 
} 

