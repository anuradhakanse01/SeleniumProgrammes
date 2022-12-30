package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}

		for (int i = 0; i < num.length - 1; i++) {
			if (!set.contains(num[i] + 1)) {
				System.out.println(num[i] + 1);
			}
		}
	}

}
