package com.weshopify.feature.di.commons;

import java.util.Optional;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.weshopify.feature.di.setter.CreditCard;

public class BeanFactoryContainer {

	public static void main(String[] args) {
		BeanFactory container = new ClassPathXmlApplicationContext("spring-beans.xml");
		Order order = (Order)container.getBean(Order.class);
		
		if(Optional.of(order.getListOfProducts()).isPresent()) {
			order.getListOfProducts().stream().forEach(product->{
				System.out.println(product.getProductId());
				System.out.println(product.isAvailable());
				System.out.println(product.getName());
				System.out.println(product.getCategory());
				System.out.println("=========================");
			});
		}
		
	
		
		/*
		 * PaymentService paymentService = container.getBean(PaymentService.class);
		 * //paymentService.doPayment(order); paymentService.doPayment();
		 */
	}

}
