package com.te.learn.practices;

import java.util.Scanner;

public class ArrayShift {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String arr[] = new String[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = scanner.nextLine();
		}
		String arr2[] = new String[arr.length];
		int a;
		System.out.println("How many shift you need ?");

		a = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr2[((arr.length+i) + a) % arr.length] = arr[i];
		}
		for (String j : arr2) {

			System.out.println(j);
		}
		System.out.println("--------------------");
		for (int i = 0; i < arr.length; i++) {
			arr2[((arr.length+i)-a) % arr.length] = arr[i];
		}
		for (String j : arr2) {

			System.out.println(j);
		}
	}

}
