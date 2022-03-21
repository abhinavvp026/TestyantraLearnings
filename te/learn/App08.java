package com.te.learn;

import jdk.internal.dynalink.beans.StaticClass;

public class App08 {
	
		int a=10;
		{
			System.out.println("Non static multi line initializer got executed");
		}
		public void demoNonStaticMethod() {
			System.err.println("Non Ststic method got executed");
			
		}
		static int b=20;
		static {
			System.out.println("static multililine initializer");
		}
  static void staticDemo() {
	  System.out.println("static method executed");
  }
		public static void main(String[] args) {
			System.out.println("Main method got executed");
			App08 app=new App08();
			staticDemo();
			System.out.println("Evrything Got executed");
		}

	}
