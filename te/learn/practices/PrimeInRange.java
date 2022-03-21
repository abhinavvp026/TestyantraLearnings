package com.te.learn.practices;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		System.out.println("Enter the Range:(Starting Number And Ending Number)");
		Scanner scanner = new Scanner(System.in);
		int startNumber = scanner.nextInt();
		int endNumber = scanner.nextInt();
		int i = startNumber;
		System.out.println("Given range is from " + startNumber + " to " + endNumber);
		while (i <= endNumber) {
			int count = 1;
			int half = i / 2;
			int j;
			for (j = 1; j <= half; j++) {
				if (i % j == 0)
					count++;

			}
			if (count == 2) {
				System.out.print(i + " ");
			}
			i++;

		}
		System.out.println();

	}

}
