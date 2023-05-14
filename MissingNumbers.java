package collections.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {

	/*
	 * Problem
	 * 
	 * There will be running number between 1 to 10 One of the unique number will be
	 * missing Find the missing number
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set b) Make sure the set is in the ascending
	 * order c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */

	public static void main(String[] args) {

		int[] nums = { 9, 8, 6, 2, 3, 1, 5, 8, 4, 10 };

		Set<Integer> number = new TreeSet<Integer>();

		for (int i = 0; i < nums.length; i++) {

			number.add(nums[i]);
		}

		List<Integer> list = new ArrayList<Integer>(number);
		
		int sizeList = list.size();
		
		for (int i = 0; i < sizeList-1; i++) {

			if (list.get(i) == list.get(i + 1) - 1) {
				continue;
			} 
			else
			{
				System.out.println("Missing number is :" + (list.get(i) + 1));
			}
			
		}

	}

}
