package collections.program;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {

	/*
	 * Pseudo code
	 * 
	 * a) Use the declared String text as input String text =
	 * "We learn java basics as part of java sessions in java week1";
	 *
	 * Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then
	 * iterate the Array c) Create a empty Set d) Iterate the String array d.1) add
	 * each word into Set e) Print the Set values which is having unique words
	 */

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] words = text.split(" ");

		Set<String> setWord = new LinkedHashSet<String>();

		for (int i = 0; i < words.length; i++) {
			setWord.add(words[i]);
		}

		List<String> list = new ArrayList<String>(setWord);

		String unique = "";

		for (int i = 0; i < list.size(); i++) {

			unique += list.get(i) + " ";

		}

		System.out.println(unique);
	}

}
