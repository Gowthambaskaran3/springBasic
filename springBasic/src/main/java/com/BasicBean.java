package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BasicBean {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
 
		BasicImpl print = (BasicImpl) context.getBean("laptop");
		print.print();
		}
	}
