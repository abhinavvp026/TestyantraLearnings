package com.te.learn.practices;

public class SecondMinMax {

	public static void main(String[] args) {
		int arr[] = { 1,20,0,99};
		int max = arr[1];
		int min = arr[1];
		int secondMax = arr[1];
		int secondMin = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}

		}
		System.out.println( secondMax);
		secondMin=max;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] < secondMin && arr[i] > min) {
				secondMin = arr[i];
			}

		}
		System.out.println( secondMin );
	}
}
