package com.te.learn.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<Student> linkedList = new LinkedList();
		linkedList.add(new Student(01, "Arjun", 33)); // adding student objects to Linkedlist object
		linkedList.add(new Student(02, "Amal", 21));
		linkedList.add(new Student(03, "vimal", 44));
		// 1st method
		System.out.println("--------------1st method-----------");
		System.out.println(linkedList);
		// 2nd method
		System.out.println("--------------2nd method-----------");
		for (Student object : linkedList) {
			System.out.println(linkedList);

		}
		// 3rd method
		System.out.println("--------------3rd method-----------");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList);

		}
		// 4th method
		System.out.println("--------------4th method-----------");
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------5th method-----------");
		ListIterator listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("--------------Reverse order-----------");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
