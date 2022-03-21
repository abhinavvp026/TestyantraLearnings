package com.te.learn.exceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		int age=10;
		System.out.println("Enter your age");
		Scanner scanner=new Scanner(System.in);
		age=scanner.nextInt();
		if(age<0) {
			throw new AgeNotCorrectException("negative age is not possible");
			
		}

	}

}
