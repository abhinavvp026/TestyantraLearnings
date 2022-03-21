package com.te.learn.practices;

public class VowelCount {

	public static void main(String[] args) {
		int count=0;
		String string="HRLLOAEIOUNNHUAAS";
		string=string.toLowerCase();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(string);
		System.out.println(count);

	}

}
