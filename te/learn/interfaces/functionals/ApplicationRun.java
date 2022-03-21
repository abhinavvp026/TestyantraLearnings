package com.te.learn.interfaces.functionals;

import java.util.Arrays;

public class ApplicationRun {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(01, "Sharath", 36,20000), new Employee(02, "Arun", 25,25000),
				new Employee(03, "amal", 40,50000) };
		Arrays.sort(employees, new CompareEmployeeByAge());
		for (Employee i : employees) {
			System.out.println(i);

		}

	}

}
