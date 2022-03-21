package com.te.learn.abstractclass;

public abstract class Parent {
	int n;
	static {
		System.out.println("Parent static multiline initilizer");
	}
	{
		System.out.println("Parent non static multi line initializer");
	}

	public Parent() {
		System.out.println("parent class default constructor");

	}

	public Parent(int n) {
		this();
		this.n = n;
		System.out.println("argumented constructor of parent class");
	}

	public abstract void run();
}
