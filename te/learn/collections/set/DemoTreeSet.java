package com.te.learn.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {

		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student(1, "abhi", 20));
		set.add(new Student(1, "abhi", 21));
		set.add(new Student(2, "vimal", 35));
		set.add(new Student(3, "arjun", 19));
		System.out.println("------------st method---------");
		System.out.println(set);
		System.out.println("--------------2nd method---------------");
		for (Student student : set) {

			System.out.println(student);
		}
		System.out.println("----------3rd method------------------");
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
