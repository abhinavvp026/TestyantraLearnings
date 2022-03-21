package com.te.learn.practices;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetReversing {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student(1, "abhi", 22));
		treeSet.add(new Student(2, "rashi", 24));
		treeSet.add(new Student(3, "arun", 21));
		treeSet.add(new Student(4, "ramesh", 20));
		treeSet.add(new Student(5, "arjun", 32));

		Iterator iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("----------------------------");

		Comparator comparator = (o1, o2) -> {
			Student student = (Student) o1;
			Student student2 = (Student) o2;
			if (student.getsAge() < student2.getsAge())
				return 1;
			else if (student.getsAge() > student2.getsAge())
				return -1;

			return 0;

		};
		TreeSet<Student> treeSet2 = new TreeSet<Student>(comparator);
		treeSet2.add(new Student(1, "abhi", 22));
		treeSet2.add(new Student(2, "rashi", 24));
		treeSet2.add(new Student(3, "arun", 21));
		treeSet2.add(new Student(4, "ramesh", 20));
		treeSet2.add(new Student(5, "arjun", 32));
		
		Iterator iterator2=treeSet2.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());

		}
	}
}
