package com.te.learn.basics;

public class app2 {

	public static void main(String[] args) {
		Human human = new Human();
		human.setHumanName("Abhinav");
		human.setHumanAge(20);
		human.setHumanHeight(180);
		System.out.println(human.getHumanName());
		System.out.println(human.getHumanAge());

		Address att = human.createAddressObj();
		human.setAddress(att);
		System.out.println(human.getAddress());

	}

}
