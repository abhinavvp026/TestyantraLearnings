package com.te.learn.inheritance;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		int temp = 0;
		int j = 1;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibinocai series");
		System.out.println("please enter the limit ");
		int limit = scanner.nextInt();
		while (j <= limit) {
			System.out.println(i);
			temp = j;
			j = i + j;
			i = temp;
		}
	}
}
