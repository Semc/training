package com.tutorial.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	
	public static void main(String[] args){
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		ApplicationContext context = new FileSystemXmlApplicationContext("//home/marcin/training/tutorial/src/Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();
	}

}
