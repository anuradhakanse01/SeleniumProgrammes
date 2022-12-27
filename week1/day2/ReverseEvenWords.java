package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] arr = test.split(" ");
		StringBuilder strb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				String rev = "";
				char[] array = arr[i].toCharArray();
				for (int j = array.length - 1; j >= 0; j--) {
					rev = rev + String.valueOf(array[j]);
				}
				strb.append(rev).append(" ");
			} else {
				strb.append(arr[i]).append(" ");
			}

		}
		System.out.println(strb.toString());
	}

}
