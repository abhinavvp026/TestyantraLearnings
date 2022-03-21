package com.te.learn.practices;

import java.util.Arrays;

public class ExtraCharString {

	public static void main(String[] args) {
		String string = "Abhinava  bhina!@#$%^&*(hagg";
		System.out.println("original string is: " + string);
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 65 && string.charAt(i) <= 90 || string.charAt(i) >= 97 && string.charAt(i) <= 122) {
				result = result + string.charAt(i);
			}

		}
		System.out.println("After removing all " + result);

	}

}
