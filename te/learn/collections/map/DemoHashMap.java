package com.te.learn.collections.map;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
	HashMap<Integer, String> hashMap=new HashMap();
	hashMap.put(1, "arun");
	hashMap.put(2, "arjun");
	hashMap.put(3, "vishal");
	for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
		System.out.println("key: "+entry.getKey() +"value:" +entry.getValue());
		
	}
	//using student type
	HashMap<Integer, Student> hashMap2=new HashMap();
	hashMap2.put(2, new Student(1,"abhi",25));
	System.out.println(hashMap2);
	

	}

}
