package com.te.learn.abstractclass;

public class Child extends Parent {
	int n;
	static {
		System.out.println("Child class static multiline initializer");
	}
	{
		System.out.println("Child class non static multiline initializer");
	}

	public Child() {
		super(5);
		System.out.println("Default constructor of child class");
	}

	public Child(int n) {
		this();
		this.n = n;
		System.out.println("argumented constructor of child class");

	}

	@Override
	public void run() {
		System.out.println("Overloaded method");

	}

}
