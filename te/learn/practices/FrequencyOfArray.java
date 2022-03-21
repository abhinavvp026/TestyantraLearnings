package com.te.learn.practices;
import java.util.Scanner;

public class FrequencyOfArray {

	public static void main(String[] args) {
		System.out.println("enter the number of elemts in array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		char[] arr = new char[size];
		System.out.println("enter the array elements");
		for (int loop = 0; loop < size; loop++) {
			arr[loop] = scanner.next().charAt(0);
		}
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;
					
				}
				
			}
			if(count>1) {
			System.out.println("array element " + arr[i] + " repeats: " + count);
			}			
			count = 0;

		}
		System.out.println(arr);

	}
}