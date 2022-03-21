package com.te.learn.practices;

public class ConsanantsApp {

	public static void main(String[] args) {
		int count=0;
		String string="HRLLOAEIOUKOPLKKKNNHUAA!@#$%^&*()S";
		string=string.toLowerCase();
		String string2=string.replaceAll("[^a-z0-9]", "");
		for(int i=0;i<string2.length();i++) {
			if(string2.charAt(i)=='a' || string2.charAt(i)=='e' || string2.charAt(i)=='i' || string2.charAt(i)=='o' || string2.charAt(i)=='u') {
		
			}else
				count++;
		}
		System.out.println(string2);
		System.out.println(count);

	}

	}

