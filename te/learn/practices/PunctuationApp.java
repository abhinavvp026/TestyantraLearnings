package com.te.learn.practices;

public class PunctuationApp {

	public static void main(String[] args) {
		 String  s="hello!+;<>==----";
		 s= s.replaceAll("[!<>.,?;:]", "");
		 System.out.println(s);
	}

}
