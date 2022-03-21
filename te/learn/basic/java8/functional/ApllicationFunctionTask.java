package com.te.learn.basic.java8.functional;

import java.util.function.Function;

public class ApllicationFunctionTask {

	public static void main(String[] args) {
		Function<String, Boolean> function = s -> {
			String copy = s;
			String rev = "";
			for (int i = (s.length() - 1); i >= 0; i--) {
				rev = rev + s.charAt(i);
			}
			System.out.println("reverted string: " + rev);

			System.out.println("original string: " + copy);
			if (rev.equalsIgnoreCase(copy))
				return true;
			return false;

		};
		System.out.println("the string is pallindrome: ? \n" + function.apply("Malayalam"));

	}

}
