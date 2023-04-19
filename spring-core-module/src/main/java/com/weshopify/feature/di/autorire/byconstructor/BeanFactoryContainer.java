package com.weshopify.feature.di.autorire.byconstructor;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.weshopify.feature.config.AppConfig;
import com.weshopify.feature.di.setter.CreditCard;

public class BeanFactoryContainer {

	public static void main(String[] args) {
		// BeanFactory container = new
		// ClassPathXmlApplicationContext("spring-autowiring.xml");
		// ApplicationContext container = new
		// ClassPathXmlApplicationContext("spring-autowiring.xml");
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Beans Loaded and Created in Spring Core Container ");
		Arrays.asList(container.getBeanDefinitionNames()).forEach(name -> System.out.println(name));
		System.out.println("-----------------------------------------------------------");

		Order order = (Order) container.getBean(Order.class);
		System.out.println("Order Details are:\t");
		System.out.println("=============================");
		System.out.println("Order Id:\t" + order.getOrderId());
		System.out.println("Product Details are:");
		System.out.println("-------------------------------");

		order.getListOfProducts().stream().forEach(product -> {
			System.out.println("product name is:\t" + product.getName());
			System.out.println("Category is:\t" + product.getCategory());
			System.out.println("\n");
		});

		System.out.println("-------------------------------");
		System.out.println("Order Details are:");
		OrderDetails orderDetails = order.getOrderDetails();
		orderDetails.getOrdersInfo().keySet().forEach(key -> {
			System.out.println(key + "\t" + orderDetails.getOrdersInfo().get(key));
		});

	}

}
