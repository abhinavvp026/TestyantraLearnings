package com.te.learn.basics;

public class App1 {
	int a = 10;
	int b = 20;
	{
		System.out.println("Non static Multiline Initializer gto executed");
	}

	public App1() {
		System.out.println("App1() constructor got executed");
	}

	public App1(int a) {
		this();
		this.a = a;
		System.out.println("App1(int a) Constructor Got executed");
	}

	public App1(int a, int b) {
		this(a);
		this.b = b;
		System.out.println("App1(int a, int b) Constructor Got executed");
	}

	public static void main(String args[]) {
		System.out.println("main method started to get executed");
		App1 app1 = new App1(10, 30);
		System.out.println(app1.a);
		System.out.println(app1.b);
	}

}
