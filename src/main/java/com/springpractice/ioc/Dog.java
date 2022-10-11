package com.springpractice.ioc;

public class Dog {

	int id;
	String name;
	String email;

	public Dog(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public void eat() {

		System.out.println("Bow Bow!!!");

	}

}
