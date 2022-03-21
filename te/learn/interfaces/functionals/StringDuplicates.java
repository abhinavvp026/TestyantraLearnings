package com.te.learn.interfaces.functionals;
import java.util.HashSet;

public class StringDuplicates {

	public static void main(String[] args) {
		boolean bool;
		String s = "SANOOOOOOOJ";
		HashSet hashSet = new HashSet();
		HashSet hashSet2 = new HashSet();
		for (int i = 0; i < s.length(); i++) {
			bool = hashSet.add(s.charAt(i));
			if (bool) {

			} else {
				hashSet2.add(s.charAt(i));
			}
		}
		System.out.println("duplicates elements are:");
		for (Object object1 : hashSet2) {
			System.out.print(" " + object1.toString());

		}
		System.out.println("\n-----remaining elements- without duplicates--------");
		for (Object object : hashSet) {

			System.out.print(" " + object.toString());

		}

	}
}
