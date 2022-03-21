package com.te.learn.practices;

public class BubbleSortingApp {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 15, 90, 12, 1 };
		int temp = 0;
		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {

			System.out.println(arr[k]);

		}
	}
}
