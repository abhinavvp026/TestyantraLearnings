package com.te.learn.basic;

public class learnString {

	public static void main(java.lang.String[] args) {
		String a = "abhi";
		System.out.println(a);
		Integer f = 10;

		String b = "abhi"; // string
		char c = a.charAt(1);
		int len = a.length();
		System.out.println(c);
		System.out.println(a.equals(b));
		System.out.println(len);
		String[] g = a.split("a", 2);
		System.out.println(g);
		StringBuffer buffer = new StringBuffer("hello how are you"); // stringbuffer implementation
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		StringBuilder builder = new StringBuilder("hello how are you"); // stringbuilder implimentation
		System.out.println(builder.length());
		System.out.println(builder.capacity());
		buffer.append("  i am fine ");
		System.out.println(buffer);
		System.out.println(buffer.delete(10, 15));
		System.out.println(buffer.insert(10, "hello"));
		StringBuilder builder2 = new StringBuilder("Ajay kumar Gupta");
		System.out.println(builder2.reverse());
		System.out.println(buffer.replace(10, 15, "come here"));
		char arr[] = { 'a', 'b' };
		System.out.println(arr);
		
		
		String s=new String("HELLO");
		s.toLowerCase();
		System.out.println(s);
		s=s.toLowerCase();
		System.out.println(s);

	}

}
