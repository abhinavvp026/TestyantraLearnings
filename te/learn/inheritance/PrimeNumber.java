package com.te.learn.inheritance;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		int num = 0;
		int i = 0;
		int half;
		int count;
		System.out.println("Enter the number to be checked prime number or not");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		half = num / 2;
		count = 1;
		for (i = 1; i <= half; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("It is not a prime number");
		} else {
			System.out.println("it is a prime number");
		}

	}
}
