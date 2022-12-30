package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "anuradha";

		char[] array = name.toCharArray();
		Set<Character> set = new TreeSet<Character>();

		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
			} else {
				set.remove(array[i]);
			}
		}
		System.out.println(set);

	}

}
