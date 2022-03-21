package com.te.learn.collections;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList <Student>arrayList = new ArrayList(); // creating arraylist object
		arrayList.add(new Student(01, "Arjun", 33)); // adding student objects to arralist object
		arrayList.add(new Student(02, "Amal", 21));
		arrayList.add(new Student(03, "vimal", 44));
		System.out.println("--------1st method--------------");
		// 1st method
		System.out.println(arrayList);
		System.out.println("-------2nd method------------");
		// 2nd method using for each
		for (Student object : arrayList) {
			System.out.println(arrayList);

		}
		// 3rd method using for loop
		System.out.println("-----------3rd method---------------");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList);

		}
		// 4th method
		System.out.println("----------4th method---------");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// 5th method
		System.out.println("-------------5th method---------------");
		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("---------by previous-------");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
