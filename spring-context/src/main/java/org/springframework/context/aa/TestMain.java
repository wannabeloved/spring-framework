package org.springframework.context.aa;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class TestMain {
	public static void main(String[] args) {

		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:context.xml");
		BeanFactory bf = new XmlBeanFactory(res);
//		System.out.println("init BeanFactory.");
//		Object animal = bf.getBean("animal");
//		System.out.println("animal.getClass().getName() = " + animal.getClass().getName());

		A a = (A)bf.getBean("a");
		System.out.println("a.getClass().getName() = " + a.getClass().getName());
	}
}
