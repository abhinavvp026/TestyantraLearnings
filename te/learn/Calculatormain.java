package com.te.learn;

import java.util.Scanner;

public class Calculatormain {
	public static void main(String args[]) {
		int val;
		boolean flag = true;
		do {
			System.out.println("CALCULATOR");
			System.out.println("Enter the options to continue:");
			System.out.println(
					"Enter 1:Addition \n Enter 2:Substraction \n Enter 3:Multiplication \n Enter 4:Division \n Enter 5:Exit ");
			Scanner sc = new Scanner(System.in);
			val = sc.nextInt();
			switch (val) {
			case 1: {
				System.out.println("Enter the first number:");
				int a = sc.nextInt();
				System.out.println("Enter the Second number");
				int b = sc.nextInt();
				System.out.println("The Result is" + Calculator.add(a, b));
				break;
			}
			case 2: {
				System.out.println("Enter the first number:");
				int a = sc.nextInt();
				System.out.println("Enter the Second number");
				int b = sc.nextInt();
				System.out.println("The Result is" + Calculator.substract(a, b));
				break;
			}
			case 3: {
				System.out.println("Enter the first number:");
				int a = sc.nextInt();
				System.out.println("Enter the Second number");
				int b = sc.nextInt();
				System.out.println("The Result is :" + Calculator.mult(a, b));
				break;
			}
			case 4: {
				System.out.println("Enter the first number:");
				int a = sc.nextInt();
				System.out.println("Enter the Second number");
				int b = sc.nextInt();
				System.out.println("The Result is" + Calculator.div(a, b));
				break;
			}
			case 5: {
				flag = false;
				break;
			}
			default: {
				System.out.println("please enter a proper value");
				break;
			}

			}

		} while (flag);
	}

}
