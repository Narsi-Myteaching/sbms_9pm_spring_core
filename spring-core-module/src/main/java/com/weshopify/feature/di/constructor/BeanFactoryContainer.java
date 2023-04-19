package com.weshopify.feature.di.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryContainer {

	public static void main(String[] args) {
		BeanFactory container = new ClassPathXmlApplicationContext("spring-container-injection.xml");
		DebitCard dcard =  (DebitCard)container.getBean(DebitCard.class);
		System.out.println(dcard.hashCode());
		System.out.println(dcard.getCardNumber());
		System.out.println("Expiry of the debit Card is:\t"+dcard.getExpriry());
		Order orderDetails =  dcard.getOrder();
		System.out.println(orderDetails.getOrderId());
		System.out.println("products are:\t");
		orderDetails.getListOfProducts().stream().forEach(product->System.out.println(product.getName()));
	}
}
