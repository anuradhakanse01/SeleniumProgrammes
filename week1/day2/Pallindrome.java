package week1.day2;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		System.out.println("Enter any string to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";
		
		

		char[] array = str.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			rev = rev + array[i];
		}
		
		System.out.println("Reverse of " + str + " is " + rev);
		if (str.equals(rev)) {
			System.out.println(str + " is pallindrome");
		} else {
			System.out.println(str + " is not pallindrome");
		}
	}

}
