package com.te.learn.basic.java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class ApplicationPredicate {

	public static void main(String[] args) {
//		Predicate<Integer> predicate3 = new Predicate<Integer>() {
//																		//annonymous class
//			@Override
//			public boolean test(Integer i) {
//				if (i % 2 == 0)
//					return true;
//				return false;
//				
//				
//			}
//		};
		
		Predicate<Integer> predicate = i -> { // lambda functions
			if (i % 2 == 0)
				return true;
			return false;
		};
//		Predicate<Integer> predicate3 = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer i) {
//				if (i % 2 == 0)
//					return true;
//				return false;
//				
//				
//			}
//		};
		// simplified lambda function
		Predicate<Integer> predicate2 = i -> i % 2 == 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to see ");
		int num = scanner.nextInt();
		System.out.println("The given number:" + num + " Even number ? \n" + predicate.test(num));
		System.out.println("------------using simpler lambda function");
		System.out.println("The given number:" + num + " Even number ? \n" + predicate2.test(num));

	}

}
