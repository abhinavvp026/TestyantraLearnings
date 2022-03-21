package com.te.learn.practices;

public class XylemPhoem {
public static void main(String[] args) {
	int n=1043;
	int copy=n;
	int extreme=0, mean=0;
	while(n>0) {
		if(n==copy) 
			extreme+=(n%10);
		
		else if(n<10)
			extreme+=(n%10);
		else
			mean+=(n%10);
		
		n=n/10;
	}
	System.out.println(extreme==mean?"Xylem":"Phloem");
}
}
