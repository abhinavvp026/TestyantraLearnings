package com.te.learn.practices;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 5, 4, 5, 2, 1 };
		int count = 0;
		int k = 0;
		int[] arr2 = new int[10];
		for (int i = 0; i < (arr.length - 1); i++) {
			count=0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					for (int c = 0; c < arr.length; c++) {
						if (arr[i] == arr2[c]) {
							count++;
							break;
						}
					}
					if (count == 0) {
						arr2[k] = arr[i];
						k++;
					}
				}
			}
			System.out.println(arr2[i]);
		}
	}
}
