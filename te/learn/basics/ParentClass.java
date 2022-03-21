package com.te.learn.basics;

public class ParentClass {
	private int a = 10;
	private int b = 20;

	public ParentClass() {
		super();
	}

	public ParentClass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
