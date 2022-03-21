package com.te.learn;

public class App5 {
	static {
		System.out.println("Static multiline initiliser got executed");
	}
	static int a = 10;

	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() method got executed");
	}

	public void demNonstaticMethod() {
		System.out.println("demoNonStaticMethod() method got executed");
	}

	public static void main(String[] args) {
		System.out.println("main(String args[] got executed");
		demoStaticMethod();
		App5 app = new App5();
		app.demNonstaticMethod();

	}

}
