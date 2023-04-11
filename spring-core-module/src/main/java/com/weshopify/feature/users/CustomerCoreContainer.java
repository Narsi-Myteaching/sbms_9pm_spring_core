package com.weshopify.feature.users;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerCoreContainer {

	public static void main(String[] args) {
		BeanFactory container = new ClassPathXmlApplicationContext("spring-beans.xml");
		CustomerBusinessLogic cbl = (CustomerBusinessLogic) container.getBean("customerBusinessLogic");
		
		System.out.println(cbl.GetCustomerName(10));

	}

}
