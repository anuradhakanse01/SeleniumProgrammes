package week1.day1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("Enter length for fibonacci series : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int firstNum = 0;
		int secondNum = 1;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = firstNum + secondNum;
			System.out.print(firstNum + " ");
			firstNum = secondNum;
			secondNum = sum;

		}

	}

}
