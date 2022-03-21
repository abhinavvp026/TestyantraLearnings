package com.te.learn.inheritance;

import java.lang.reflect.Array;

import com.te.learn.basics.Human;

public class ObjectClass {
	public static void main(String args[]) {
		Human human = new Human("hai", 20, 35, 120);
		Human human2 = new Human("hai", 20, 35, 120);
		System.out.println(human);
		System.out.println(human.toString());
	

		System.out.println(human.equals(human2));

		if (human == human2) { // difference between equals() and ==
			System.out.println("its same ");
		} else {
			System.out.println("its not same");
		}

	}

}
