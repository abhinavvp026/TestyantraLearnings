package com.te.learn.inheritance;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number to find the factorial");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int digit = num;
		int fact = 1;
		while (digit > 0) {
			fact = fact * digit;
			digit--;

		}
		System.out.println("The factorial of a number is" + fact);

	}

}
