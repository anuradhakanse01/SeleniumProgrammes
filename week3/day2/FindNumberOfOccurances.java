package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);

	}

}
