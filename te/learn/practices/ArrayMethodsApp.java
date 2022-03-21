package com.te.learn.practices;

import java.util.Arrays;

public class ArrayMethodsApp {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,20, 4, 15 };
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 15));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
