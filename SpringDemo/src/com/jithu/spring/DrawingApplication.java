package com.jithu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author JITHU
 *
 */
public class DrawingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Triangle tri = new Triangle();
//		BeanFactory fact = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		IShape tri = (IShape) context.getBean("circle");
		tri.draw();	
		System.out.println(context.getMessage("greetings", null, "default greeetings message to jithu", null));

	}

}
