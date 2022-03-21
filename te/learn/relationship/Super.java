package com.te.learn.relationship;

public class Super {
	private int a;
	private int b;

	public Super() {
		super();
		System.out.println("Parent class default constructor is loaded");
	}

	public Super(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("Parent class argumented constructer loaded");
	}

}

class SuperChild extends Super {

	private int c;
	private int d;

	public SuperChild() {
		super(25, 30);
		System.out.println("child class default constructor loaded");
	}

	public SuperChild(int c, int b) {
		this();
		this.c = c;
		this.d = d;
		System.out.println("Child class argumented constructor loaded");
	}

}
