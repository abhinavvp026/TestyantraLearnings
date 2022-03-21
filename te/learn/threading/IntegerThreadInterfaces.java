package com.te.learn.threading;

public class IntegerThreadInterfaces implements Runnable {
	@Override
    public void run() {
		for (int i=1;i<=100;i++) {
			System.out.println("Integer"+i);
		}
	}

}
