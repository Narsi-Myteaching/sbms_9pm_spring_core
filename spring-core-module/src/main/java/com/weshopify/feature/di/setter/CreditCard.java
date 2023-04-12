package com.weshopify.feature.di.setter;

import com.weshopify.feature.di.commons.Order;
import com.weshopify.feature.di.commons.PaymentService;

public class CreditCard implements PaymentService {

	private String cardNumber;
	private String expiry;
	private String cvv;
	
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	/*
	 * public Order doPayment(Order order) {
	 * System.out.println("order details are processing for payment");
	 * System.out.println("payment method choosen is:\t"+order.getPaymentMethod());
	 * if(order.getPaymentMethod().equals("CreditCard")) {
	 * System.out.println("Card Number:\t"+cardNumber); } return order; }
	 */
	public Order doPayment() {
		System.out.println("order details are processing for payment using credit card");
		System.out.println("payment method choosen is:\t"+order.getPaymentMethod());
		if(order.getPaymentMethod().equals("CreditCard")) {
			System.out.println("Card Number:\t"+cardNumber);
			System.out.println("Order details are:\t");
			order.getOrderDetails().keySet().forEach(key -> {
				System.out.println("key is:\t"+key+"\nvalue is:\n"+order.getOrderDetails().get(key));
			});
		}
		return order;
	}

}
