package com.te.learn.inheritance;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {            
		int digit;
		int sum = 0;
		System.out.println("Enter the 3 digit number to check if armstrong or not");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		while (num != 0) {
			digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;
		}
		if (sum == copy) {
			System.out.println("Its a armstrong Number");
		} else {
			System.out.println("It is not a armstrong Number");
		}

	}
}
