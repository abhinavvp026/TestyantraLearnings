package com.te.learn;

public class App6 {
	static {
		System.out.println("Static multiline initiliser got executed");
		App6 app = new App6();
		int b = app.returnMeInt();
		System.out.println("Returned me value" + b);
	}
	static int a = 10;

	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() method got executed");
	}

	public void demNonstaticMethod() {
		System.out.println("demoNonStaticMethod() method got executed");
	}

	public int returnMeInt() {
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("main(String args[] got executed");
		demoStaticMethod();
		App6 app = new App6();
		app.demNonstaticMethod();

	}

}
