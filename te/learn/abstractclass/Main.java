package com.te.learn.abstractclass;

public class Main {
	static {
		System.out.println("Main class static method");
	}

	public static void main(String[] args) {
		
		Parent parent = new Child(10);
		parent.run();

	}

}
