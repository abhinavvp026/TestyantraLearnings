package com.te.learn.practices;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 15, 3, 10 };
		int max = 0;
		int secondmax = 0;
		int thirdmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		} 
		for (int j = 0; j < arr.length; j++) {
			if (secondmax < arr[j] && (secondmax < max) && arr[j] != max) {

				secondmax = arr[j];
			}
		}
		for (int k = 0; k < arr.length; k++) {
			if (thirdmax < arr[k] && (thirdmax < secondmax) && arr[k] != secondmax && arr[k] !=max) {
				thirdmax = arr[k];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
		System.out.println(thirdmax);

	}
}
