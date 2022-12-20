package week1.day1;

import java.util.Scanner;

public class IsPrimeNumberCheck {

	public static void main(String[] args) {

		System.out.println("Enter number to check prime or not : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				count++;
		}

		if (count > 0) {
			System.out.println(num + " is not Prime");
		} else {
			System.out.println(num + " is Prime");
		}

	}

}
