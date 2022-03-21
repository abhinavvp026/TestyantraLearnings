package com.te.learn.basics;

public class HumanAccess {
	
	public static void main(String args[]) {
		Human human=new Human();
		human.setHumanName("humanName");
		human.setHumanAge(20);
		human.getHumanHeight();
		human.getHumanWeight();
		System.out.println(human.getHumanName());
		
		
	}

}
