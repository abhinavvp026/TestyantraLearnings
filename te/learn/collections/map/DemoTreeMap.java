package com.te.learn.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Student> treemap =new TreeMap();
		treemap.put(1, new Student(1, "abhi", 21));
		treemap.put(2, new Student(2, "arjun", 35));
		treemap.put(3, new Student(3, "vimal", 36));
		treemap.put(4, new Student(4, "arun", 12));
		for (Map.Entry<Integer, Student> entry :  treemap.entrySet()) {
			System.out.println("key:" + entry.getKey() +"value" + entry.getValue());
			
		}
		

	}

}
