package com.weshopify.feature.users;

public class CustomerServiceContainer {

	CustomerBusinessLogic cbl=null;
	public CustomerServiceContainer() {
		
		ICustomerDataAccess customerDataAccess = new CustomerDataAccess();
		cbl = new CustomerBusinessLogic(customerDataAccess);
		
	}
	
	public CustomerBusinessLogic getCustomerObject() {
		return this.cbl;
	}
	
	
	public static void main(String[] args) {
		CustomerServiceContainer container = new CustomerServiceContainer();
		CustomerBusinessLogic cbl1= container.getCustomerObject();
		System.out.println(cbl1.GetCustomerName(10));
	}
	
}
