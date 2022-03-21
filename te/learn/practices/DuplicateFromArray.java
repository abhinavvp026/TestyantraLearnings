package com.te.learn.practices;

public class DuplicateFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,1,5, 4 ,5,2,1};
		for (int i = 0; i < (arr.length-1); i++) {
			for(int j=(i+1);j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}
}
