package com.te.learn.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(120);
		hashSet.add(10);
		hashSet.add(50);
		hashSet.add(02);
		hashSet.add(05);
		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
		System.out.println("----------");
		Iterator iterator= hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
