package collections.program;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	/*
	 * Problem
	 * 
	 * a) Take your name as input b) Print all unique characters only (any order)
	 * 
	 * Input: babu Output: a u
	 * 
	 */

	/*
	 * Psuedocode
	 * 
	 * a) Convert String to Character array b) Create a new Set -> HashSet c) Add
	 * each character to the Set and if it is already there, remove it d) Finally,
	 * print the set
	 * 
	 */

	public static void main(String[] args) {

		// String name = "babu";
		String name = "veeramanikanda"; //when 3 character repeats it is not removed

		char[] ch = name.toCharArray();

		Set<Character> setChar = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			boolean add = setChar.add(ch[i]);

			if (add) {
				setChar.add(ch[i]);
			} else {
				setChar.remove(ch[i]);
			}
		}
		System.out.println(setChar);

	}

}
