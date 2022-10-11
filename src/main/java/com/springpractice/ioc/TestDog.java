package com.springpractice.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class TestDog {

	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("myspring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Dog dog = (Dog) factory.getBean("dog");
		dog.eat();
		System.out.println(dog.id + " " + dog.name + " " + dog.email);

	}

}
