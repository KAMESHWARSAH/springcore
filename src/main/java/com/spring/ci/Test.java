package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/ci/ciconfig.xml");
	Person per = (Person) context.getBean("person");
	
	Addition add =(Addition) context.getBean("add");
	System.out.println(per);
	
	add.doSum();
	}

}
