package com.te.learn.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.sun.corba.se.spi.orbutil.proxy.LinkedInvocationHandler;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Student> hashSet = new LinkedHashSet<Student>();
		hashSet.add(new Student(1, "abhi", 20));
		hashSet.add(new Student(1, "abhi", 20));
		hashSet.add(new Student(2, "vimal", 35));
		hashSet.add(new Student(3, "arjun", 19));
		for (Student student : hashSet) {
			System.out.println(student);

		}
		System.out.println("-------iterator method--------");
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
