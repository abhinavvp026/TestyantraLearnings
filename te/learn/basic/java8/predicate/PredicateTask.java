package com.te.learn.basic.java8.predicate;

import java.util.function.Predicate;

public class PredicateTask {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.length() > 5;
		System.out.println("The string is more than 5 \n " + predicate.test("hellooooo"));

	}

}
