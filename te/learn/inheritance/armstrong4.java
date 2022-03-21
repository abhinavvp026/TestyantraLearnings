package com.te.learn.inheritance;

import java.util.Scanner;

public class armstrong4 {
	public static void main(String args[]) {
		int digit;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of digits");
		int no = sc.nextInt();
		System.out.println("Enter the number to check if armstrong or not");

		int num = sc.nextInt();
		int copy = num;
		while (num != 0) {
			digit = num % 10;
			sum = sum + Math.pow(digit, no);
			num = num / 10;
		}
		if (sum == copy) {
			System.out.println("Its a armstrong Number");
		} else {
			System.out.println("It is not a armstrong Number");
		}

	}
}
