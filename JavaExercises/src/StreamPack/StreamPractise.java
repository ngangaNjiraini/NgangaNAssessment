package StreamPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractise {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(23,453,2,14,536,786,3,54,565);
		
		Loops loops = new Loops();
		loops.findMin(nums);
		loops.findMax(nums);
		loops.removeOdd(nums);
		loops.removeEven(nums);
		loops.sumList(nums);
		
		Streams stream = new Streams();
		stream.findMin(nums);
		stream.findMax(nums);
		stream.removeOdd(nums);
	}
}
