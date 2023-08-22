package Basic_Programs;

import java.util.Scanner;

public class Armtrong_number {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int num = sc.nextInt();
		int temp = num;

		int sum = 0;

		for (int i = num; i >= 1; i = i / 10) {
			int rem = i % 10;
			sum = sum + (rem * rem * rem);

		}
		if (sum == temp) {
			System.out.println("given number is armstrong number");
		} else {
			System.out.println("given number is not armstrong number");
		}
	}
}