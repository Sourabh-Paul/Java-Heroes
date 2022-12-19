package com.sc.literal.setterInjection.customMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Earth {

	public static void main(String[] args) {

		String p = "com/sc/literal/setterInjection/customMap/config.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(p);

		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getFriends());
		
		((ClassPathXmlApplicationContext)applicationContext).close();
		

	}

	

}
