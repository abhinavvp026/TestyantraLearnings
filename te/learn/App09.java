package com.te.learn;

public class App09 {
	int a=10;
	int b=20;
	{
		System.out.println("Non static multiline istructor got executed");
	}
	App09(){
		System.out.println("Programmer written instruction");
	}
	public void  nonStaticDemo() {
		System.out.println("Non static Method");
		
		
	}
	public static void main(String[] args) {
		System.out.println("Main method got executed");
		App09 app09=new App09();
		System.out.println("Everything got executed");
		app09.nonStaticDemo();

	}

}
