package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		Set<String> set = new LinkedHashSet<String>();

		for (int i = 0; i < split.length; i++) {
			set.add(split[i]);
		}

		Object[] array = set.toArray();
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
		}
	}

}
