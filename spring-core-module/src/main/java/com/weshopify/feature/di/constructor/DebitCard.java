package com.weshopify.feature.di.constructor;

import java.io.Serializable;


public class DebitCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8821608488776064031L;

	private String cardNumber;
	private String expriry;
	private String cvv;
	
	public void setExpriry(String expriry) {
		this.expriry = expriry;
	}

	private Order order;

	public void setOrder(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public DebitCard(String cardNumber, String expriry, String cvv) {
		System.out.println("Debit Card is creating");
		//super();
		this.cardNumber = cardNumber;
		this.expriry = expriry;
		this.cvv = cvv;
		//this.order = order;
	}
	
	public DebitCard(String cardNumber, String expriry) {
		System.out.println("Debit Card is creating");
		//super();
		this.cardNumber = cardNumber;
		this.expriry = expriry;
		this.cvv = cvv;
		this.order = order;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getExpriry() {
		return expriry;
	}

	public String getCvv() {
		return cvv;
	}

}
