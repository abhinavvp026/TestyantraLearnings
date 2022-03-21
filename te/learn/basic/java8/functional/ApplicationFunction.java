package com.te.learn.basic.java8.functional;

import java.util.function.Function;

public class ApplicationFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> function=i->i*i;
		int num=10;
		System.out.println("Square of number" +num  +"is"+ function.apply(num));

	}

}
