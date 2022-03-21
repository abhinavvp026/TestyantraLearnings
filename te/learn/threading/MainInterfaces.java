package com.te.learn.threading;

public class MainInterfaces {

	public static void main(String[] args) {
		System.out.println("Main starts.......................................");
		Thread thread=new Thread(new CharThreadInterfaces());
		Thread thread2=new Thread(new IntegerThreadInterfaces());
		thread.start();
		thread2.start();
		System.out.println("Main ends..........................");
		
		


	}

}
