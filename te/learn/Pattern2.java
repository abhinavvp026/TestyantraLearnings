package com.te.learn;
												//main class
public class Pattern2 {

	public static void main(String[] args) {	
		int row = 6;							//initializing Max No. of Stars to print
		for (int i = 1; i <= row; i++) {		//Outer Loop for Row
			for (int j = 1; j <= i; j++) {		//Inner loop for column

				System.out.print("*");			//printing The pattern
			}
			System.out.println();				//Next Line

		}
		for (int i = 1; i < row; i++) {			//Outer Loop for reverse Pattern
			for (int j = i; j < row; j++) {		//Inner Loop in reverse order

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
