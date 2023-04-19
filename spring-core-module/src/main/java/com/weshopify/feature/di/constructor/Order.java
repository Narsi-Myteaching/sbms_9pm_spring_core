package com.weshopify.feature.di.constructor;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.weshopify.feature.di.commons.Products;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5785799491013350223L;
	
	public Order() {
		System.out.println(" Order is creating");
	}
	
	private String orderId;
	private Map<String, String> orderDetails;
	private List<Products> listOfProducts;

	public String getOrderId() {
		return orderId;
	}

	public Map<String, String> getOrderDetails() {
		return orderDetails;
	}

	public List<Products> getListOfProducts() {
		return listOfProducts;
	}

	public Order(String orderId, Map<String, String> orderDetails, List<Products> listOfProducts) {
		super();
		this.orderId = orderId;
		this.orderDetails = orderDetails;
		this.listOfProducts = listOfProducts;
	}

}
