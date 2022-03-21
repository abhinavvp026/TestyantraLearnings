package com.te.learn.inheritance;

public class SubClass extends BaseClass {
	int a = 15;

	public void show() {
		System.out.println("the value in child class is:" + a);

	}

	void display() {
		show();
		super.show();
	}

}
