package org.springframework.context.aa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:context.xml");
		Object animal = ac.getBean("animal");
		System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
	}
}
