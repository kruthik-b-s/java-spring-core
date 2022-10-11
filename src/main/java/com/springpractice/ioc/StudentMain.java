package com.springpractice.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class StudentMain {

	public static void main(String[] args) {
		
		ClassPathResource resource = new ClassPathResource("myspring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student student = (Student) factory.getBean("student");
		student.printStudent();
		
	}
	
}
