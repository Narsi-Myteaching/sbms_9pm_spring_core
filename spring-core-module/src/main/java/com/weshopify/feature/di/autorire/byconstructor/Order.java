package com.weshopify.feature.di.autorire.byconstructor;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weshopify.feature.di.commons.Products;

@Component
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5785799491013350223L;
	
	/*
	 * public Order() { System.out.println(" Order is creating"); }
	 */
	
	private String orderId;
	

	private OrderDetails orderDetails;
	
	
	private List<Products> listOfProducts;
	
	//private Products product;
	
	public List<Products> getListOfProducts() {
		return listOfProducts;
	}

	private String paymentMethod;
	private String orderStatus;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Autowired
	public void setOrderDetails(OrderDetails orderDetails) {
		System.out.println("Injecting the OrderDetails through setter\t"+orderDetails.getOrderDetailsId());
		this.orderDetails = orderDetails;
	}

	@Autowired
	public void setListOfProducts(List<Products> listOfProducts) {
		System.out.println("Injecting the listOfProducts through setter");
		this.listOfProducts = listOfProducts;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	/*
	 * public Products getProduct() { return product; }
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getOrderStatus() {
		return orderStatus;
	}


	public Order(OrderDetails orderDetails) {
	  super(); 
	  System.out.println("Contstructor INjection is happening"); //
	  this.orderDetails = orderDetails;
	  System.out.println(orderDetails.getOrderDetailsId());
	  this.orderDetails.setOrderDetailsId("101");
	  //this.listOfProducts=listOfProducts;
	  }
	 

}
