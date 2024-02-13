package collections.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	// Here is the input
	int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
	// output= 7;

	/*
	 * Pseudo Code: a) Create a empty Set Using TreeSet 
	 * b) Declare for loop iterator from 0 to data.length and add into Set 
	 * c) converted Set into List 
	 * d) Print the second last element from List
	 * 
	 */

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };
		System.out.println("Original Array list:"+data);
		System.out.println("second largest number is 7 from data Array");
		// Output = 7
		
		Set<Integer> num = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			num.add(data[i]);
		}
		
		List<Integer> list1 = new ArrayList<Integer>(num);
		
		Collections.sort(list1);

		System.out.println("After sorting the Array:"+list1);
		
		System.out.println("Second largest number in array is : ");
		
		System.out.print(list1.get(1));
		
		
		
		
		

	}

}
