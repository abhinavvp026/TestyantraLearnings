package com.te.learn.threading;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main method started");
		IntegertThread integertThread=new IntegertThread();
		CharThread charThread= new CharThread();
		charThread.start();
		integertThread.start();
		System.out.println("Main method ended");
		

	}

}
