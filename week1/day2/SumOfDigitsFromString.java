package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int sum = 0;

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
		}

		System.out.println("Sum of digits in string is : " + sum);
	}

}
