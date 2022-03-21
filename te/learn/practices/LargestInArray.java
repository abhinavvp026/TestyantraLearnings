package com.te.learn.practices;

public class LargestInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 15, 3, 10 };
		int max = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
