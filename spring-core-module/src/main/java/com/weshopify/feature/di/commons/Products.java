package com.weshopify.feature.di.commons;

import java.io.Serializable;

public class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1371333211998073299L;
	
	private long productId;
	private String name;
	private String category;
	private boolean isAvailable;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
