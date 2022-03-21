package com.te.learn.exceptions;



public class AgeNotCorrectException extends RuntimeException{
	private int age=0;
	AgeNotCorrectException(String str){
		super(str);
		System.out.println("Enter a positive value");
	}
	

}
