package collections.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	/*
	 * Declare a String array and add the Strings values
	 * 
	 * as (HCL, Wipro, Aspire Systems, CTS)
	 * 
	 * get the length of the array
	 * 
	 * sort the array
	 * 
	 * Iterate it in the reverse order
	 * 
	 * print the array Required Output: Wipro, HCL , CTS, Aspire Systems
	 * 
	 */

	public static void main(String[] args) {

		String[] str = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}

		Collections.sort(list);

		int size = list.size();

		for (int i = size - 1; i >= 0; i--) {

			System.out.print(list.get(i) + " ");
		}

	}

}
