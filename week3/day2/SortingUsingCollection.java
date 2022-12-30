package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String arr[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		int len = arr.length;
		System.out.println(len);

		List<String> list = new ArrayList<String>();
		{
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
		}

		Collections.sort(list);

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

}
