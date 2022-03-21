package com.te.learn.practices;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("Enter the number to check armstrong or not:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int copy = num;
		int numcopy = num;
		int digit;
		int rev = 0;
		int count = 0;
		while (numcopy > 0) {
			count++;
			numcopy = numcopy / 10;

		}
		while (num > 0) {
			digit = num % 10;
			rev = rev + (int) Math.pow(digit, count);
			num = num / 10;
		}
		if (copy == rev) {
			System.out.println("it is an amstrong number");

		} else
			System.out.println("Not an armstrong number");

	}

}
