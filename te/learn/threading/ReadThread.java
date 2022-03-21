package com.te.learn.threading;

public class ReadThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<Story.str.length();i++) {
		System.out.println(Story.str);
	}

}
}