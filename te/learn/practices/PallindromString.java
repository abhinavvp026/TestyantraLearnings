package com.te.learn.practices;

import java.util.Scanner;

public class PallindromString {

	public static void main(String[] args) {
		System.out.println(" check if pallindrom  or not \n enter the string :");
		String string = new String();
		String rev = new String();
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		String copy = string;
		char c;

		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			rev = c + rev;

		}
		if (rev.equals(copy)) {
			System.out.println("it is a pallindrome string  " + rev);
		} else

			System.out.println(rev + "  is not a pllindrome");
	}

}
