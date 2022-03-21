package com.te.learn.threading;

public class CharThread extends Thread {
	@Override
    public void run() {
		for (char c='a';c<='z';c++) {
			System.out.println("Char:"+c);
		}
	}

	

}
