package com.te.learn.polymorphism;

public class App22 {
	public static void add() {
		System.out.println("parent class");
	}

	public static void main(String[] args) {
		App22 a = new child_(); //upcasting
		child_ b=(child_) a;	///Downcasting
		b.add();

	}

}

class child_ extends App22 {
	public static void add() {
		System.out.println("Child class");
	}
}
