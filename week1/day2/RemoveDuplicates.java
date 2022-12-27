package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		String[] split = text.split(" ");
		int count = 0;
		String repla = "";

		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					repla = text.replace(split[i], "");
				}
			}
		}
		System.out.println(repla);
	}
}
