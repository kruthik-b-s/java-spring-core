package com.springpractice.ioc;

public class Car {

	Engine engine;

	public void setEngine(Engine engine) {

		this.engine = engine;

	}

	public void move() {

		System.out.println(engine.start());
		System.out.println("Car is moving....");

	}

}
