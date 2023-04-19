package com.weshopify.feature.di.autorire.byconstructor;

import java.io.Serializable;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class OrderDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4189676360085955184L;
	private String orderDetailsId="100";
	private Map<String, String> ordersInfo;
	public String getOrderDetailsId() {
		return orderDetailsId;
	}

	
	  public void setOrderDetailsId(String orderDetailsId) { this.orderDetailsId =
	  orderDetailsId; }
	 
	public Map<String, String> getOrdersInfo() {
		return ordersInfo;
	}
	
	  public void setOrdersInfo(Map<String, String> ordersInfo) { this.ordersInfo =
	  ordersInfo; }
	 
	
	/*
	 * public OrderDetails(String orderDetailsId, Map<String, String> ordersInfo) {
	 * super(); this.orderDetailsId = orderDetailsId; this.ordersInfo = ordersInfo;
	 * }
	 */
	
	
}
