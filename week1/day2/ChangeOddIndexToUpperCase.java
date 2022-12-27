package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String text = "changeme";
		char arr[] = text.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				arr[i] = Character.toUpperCase(arr[i]);
			}

		}
		System.out.println(arr);
	}

}
