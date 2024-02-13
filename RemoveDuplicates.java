package collections.program;

import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Set;

public class RemoveDuplicates {

	/*
	 * Declare a String as "PayPal India" Convert it into a character array Declare
	 * a Set as charSet for Character Declare a Set as dupCharSet for duplicate
	 * Character Iterate character array and add it into charSet if the character is
	 * already in the charSet then, add it to the dupCharSet Check the dupCharSet
	 * elements and remove those in the charSet Iterate using charSet Check the
	 * iterator variable isn't equals to an empty space print it
	 */

	public static void main(String[] args) {

		String str = "Pay Pal";

		char[] ch = str.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();

		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			boolean add = charSet.add(ch[i]);
			// Adding non duplicate to Set (dupCharSet)
			if (!add)
			{
				dupCharSet.add(ch[i]);
			}
		}

		System.out.println(dupCharSet); //[P,a]
		System.out.println(charSet); //[P,a,y, , l]

		charSet.removeAll(dupCharSet);
		System.out.println(charSet); // [y,  , l]

		Iterator<Character> iterVar = charSet.iterator();

		while (iterVar.hasNext()) {
			char chVar = iterVar.next();
			if((chVar != ' '))
			{
				System.out.print(chVar);
			}
			
		}

	}

}
