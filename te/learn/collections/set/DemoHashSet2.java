package com.te.learn.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet2 {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(1,"abhi",20));
		hashSet.add(new Student(1,"abhi",20));
		hashSet.add(new Student(2,"vimal",35));
		hashSet.add(new Student(3,"arjun",19));
		for (Student student: hashSet) {
			System.out.println(student);
		}
		System.out.println("-----using iterator-----");
		Iterator iterator= hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
