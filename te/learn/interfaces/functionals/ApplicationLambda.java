package com.te.learn.interfaces.functionals;

import java.util.Comparator;
import java.util.Scanner;


public class ApplicationLambda {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(01, "Sharath", 36,10000), new Employee(02, "Arun", 25,150000),
				new Employee(03, "amal", 40,40000) };
		System.out.println("Please enter the options in which way you want to sort");
		System.out.println("1 : To sort by Age");
		System.out.println("2: To sort by Salary");
		Scanner scanner = new Scanner(System.in);
		int decide = scanner.nextInt();
		switch (decide) {
		case 1: {
			Comparator comparator = (o1, o2) -> {
				Employee employee = (Employee) o1;
				Employee employee2 = (Employee) o2;
				if (employee.geteAge() < employee2.geteAge())
					return -1;
				else if (employee.geteAge() > employee2.geteAge())
					return 1;

				return 0;

			};
			break;
		}
		case 2: {

			Comparator comparator2 = (o1, o2) -> {
				Employee employee = (Employee) o1;
				Employee employee2 = (Employee) o2;
				if (employee.geteSalary()< employee2.geteSalary())
					return -1;
				else if (employee.geteSalary() > employee2.geteSalary())
					return 1;

				return 0;

			};
			break;
		}
		default: {
			System.out.println("Please enter the proper options");
		}
		}

		for (Employee i : employees) {
			System.out.println(i);

		}

	}
}
