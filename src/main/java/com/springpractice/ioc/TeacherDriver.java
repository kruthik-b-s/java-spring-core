package com.springpractice.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class TeacherDriver {

	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("myspring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

//		Teacher teacher = (Teacher) factory.getBean("teacher");
//		System.out.println(teacher.id + " " + teacher.name + " " + teacher.email);
		
		Car car = (Car) factory.getBean("car");
		car.move();

	}

}
