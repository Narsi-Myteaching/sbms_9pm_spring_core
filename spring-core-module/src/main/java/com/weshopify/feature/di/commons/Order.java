package com.weshopify.feature.di.commons;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5785799491013350223L;
	
	private String orderId;
	private Map<String, String> orderDetails;
	private List<Products> listOfProducts;
	public List<Products> getListOfProducts() {
		return listOfProducts;
	}
	public void setListOfProducts(List<Products> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}
	private String paymentMethod;
	private String orderStatus;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Map<String, String> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Map<String, String> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	

}
