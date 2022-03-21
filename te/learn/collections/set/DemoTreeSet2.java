package com.te.learn.collections.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet2 {

	public static void main(String[] args) {
		Comparator comparator=(o1,o2)->{
			Student student = (Student) o1;
			Student student2=(Student)o2;
			if (student.getsId() < student2.getsId())
				return -1;
			else if (student.getsId() > student2.getsId())
				return 1;

			return 0;
			
		};
		TreeSet<Student> treeSet=new TreeSet<Student>(comparator);
		treeSet.add(new Student(1, "abhi", 20));
		treeSet.add(new Student(1, "abhi", 20));
		treeSet.add(new Student(2, "vimal", 35));
		treeSet.add(new Student(3, "arjun", 19));
		System.out.println("------------st method---------");
		System.out.println(treeSet);
		System.out.println("--------------2nd method---------------");
		for (Student student : treeSet) {

			System.out.println(student);
		}
		System.out.println("----------3rd method------------------");
		Iterator iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		

	}

}
