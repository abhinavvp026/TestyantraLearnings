package com.te.learn.interfaces.functionals;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Student[] studarray= {new Student(01,"ABHI",22,97), new Student(02,"kiran",21,88.01), new Student(03,"manav",24,56)};
		Arrays.sort(studarray);
		for (Student i : studarray) {
			System.out.println(i);
			
		}
		

	}

}
