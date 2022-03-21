package com.te.learn;

public class App07 {
	int a=10;
	{
		System.out.println("Non static multi line initializer got executed");
	}
	public void demoNonStaticMethod() {
		System.err.println("Non Ststic method got executed");
		
	}

	public static void main(String[] args) {
		System.out.println("Main method got executed");
		App07 app=new App07();
		System.out.println("Evrything Got executed");
	}

}
