package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "PayPal India";
		char[] array = str.toCharArray();

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < array.length; i++) {
			if (set.add(array[i]))
					{
				System.out.print(array[i]);
					}

		
	}

}
}
