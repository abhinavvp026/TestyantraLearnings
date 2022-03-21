package com.te.learn.basics;

public class class18 {

	public static void main(String[] args) {
		ChildClass b = new ChildClass();
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());

		ParentClass aa = new ChildClass(); // upcasting
		System.out.println(aa.getA());
		System.out.println(aa.getB());
		System.out.println("=====");
//		ChildClass bb=(ChildClass) new ParentClass();
//		System.out.println(b.getA());
//		System.out.println(b.getB());
//		System.out.println(b.getC());
//		System.out.println(b.getD());
//		System.out.println("-----------");

		ParentClass cc = new ChildClass();
		ChildClass dd = (ChildClass) cc;
		System.out.println(b.getA());
		System.out.println(b.getB());
		System.out.println(b.getC());
		System.out.println(b.getD());

	}

}
