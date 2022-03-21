package com.te.learn.collections.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Student> hashMap = new LinkedHashMap<Integer, Student>();
		hashMap.put(1, new Student(1, "abhi", 21));
		hashMap.put(2, new Student(2, "arjun", 35));
		hashMap.put(3, new Student(3, "vimal", 36));
		hashMap.put(4, new Student(4, "arun", 12));
		for (Entry<Integer, Student> string : hashMap.entrySet()) {
			System.out.println("key" + string.getKey() + "values:" +string.getValue());
			
		}

	}

}
