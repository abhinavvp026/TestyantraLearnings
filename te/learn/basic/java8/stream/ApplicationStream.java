package com.te.learn.basic.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ApplicationStream {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(2, "abhi", 30));
		arrayList.add(new Student(4, "amal", 20));
		arrayList.add(new Student(5, "arjun", 22));
		arrayList.add(new Student(6, "vimal", 28));
		System.out.println(arrayList);
		List<Student> res = new ArrayList<Student>();
		for (Student student : arrayList) {
			if (student.getsAge() < 25)
				res.add(student);

		}
		System.out.println(res);
		System.out.println("----------------------------");


		Predicate<Student> predicate= s -> s.getsAge()>25;
		
		res= arrayList.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(res);
		
		res=arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(res);
		
		

	}

}
