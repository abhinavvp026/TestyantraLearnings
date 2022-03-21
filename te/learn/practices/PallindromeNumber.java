package com.te.learn.practices;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		System.out.println("enter the number to check if it is palindrome or not");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int copy = num;
		int rev = 0;
		int digit;
		while (num > 0) {
			digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		if (rev == copy) {
			System.out.println("it is a pllindrome number");
		}
		else
			System.out.println("Not a palindrome number");

	}

}
