package com.te.learn;
//This is the main class
public class Pattern {

	public static void main(String[] args) {
		int row = 5; //Initializing the row value
		for (int i = 1; i <= row; i++) { //Outer Loop for the number of rows
			for (int j = 1; j <= i; j++) {	//Inner Loop for How many times the star prints in line

				System.out.print("*");		//printing
			}
			System.out.println();		//for the Next raw
		}
	}

}
