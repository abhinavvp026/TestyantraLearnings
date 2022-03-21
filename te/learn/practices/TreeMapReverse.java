package com.te.learn.practices;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.te.learn.practices.Student;

/**to revresly print tree map elements
 * 
 */

/**
 * @author ABHINAV V.P
 *
 */
public class TreeMapReverse {
	public static void main(String[] args) {

		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(1, 2);
		treeMap.put(2, 30);
		treeMap.put(3, 40);

		Comparator comparator = (o1, o2) -> {
			Integer integer = (Integer) o1;
			Integer integer2 = (Integer) o2;
			if (integer.intValue() > integer2.intValue())
				return -1;
			else if (integer.intValue() > integer2.intValue())
				return 1;
			return 0;
		};

		for (Entry<Integer, Integer> s : treeMap.entrySet()) {
			System.out.println("key: " + s.getKey() + " value: " + s.getValue());

		}

	}
}
