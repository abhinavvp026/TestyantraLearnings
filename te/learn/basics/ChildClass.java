package com.te.learn.basics;

public class ChildClass extends ParentClass {
	private int c = 25;
	private int d = 30;

	public ChildClass() {
		super();
	}

	public ChildClass(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
