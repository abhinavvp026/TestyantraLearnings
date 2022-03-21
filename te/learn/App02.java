package com.te.learn;

public class App02 {
	public static void main(String args[]) {
		int a=10;
		int b=15;
		int c=12;
		int d=1;
		int e=20;
		int res=(a>b && a>c && a>d && a>e) ? a :(b>c && b>d && b>e) ? b : (c>d && c>e) ? c:(d>e)?d:e;
		System.out.println(res);
	}

}
