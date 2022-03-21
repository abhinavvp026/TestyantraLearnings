package com.te.learn.inheritance;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {

		int num;
		int digit;
		int rev = 0;
		System.out.println("Enter the number to check palindrome or not");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int copy = num;
		while (num != 0) {
			digit = num % 10;
			rev = digit + rev * 10;
			num = num / 10;
		}
		if (rev == copy) {
			System.out.println("The number is pallindrome");
		} else {
			System.out.println("It is not a paliondrome number");
		}
	}

}