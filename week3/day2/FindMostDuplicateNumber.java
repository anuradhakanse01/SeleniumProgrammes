package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {

		String input = "abbaba";
		char[] arr = input.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);

		int count = 0;
		char ch = ' ';
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> set : entrySet) {

			if (set.getValue() > 0) {
				ch = set.getKey();
				count = set.getValue();
			}
		}
		System.out.println("Most duplicate number is : " + ch);
	}

}
