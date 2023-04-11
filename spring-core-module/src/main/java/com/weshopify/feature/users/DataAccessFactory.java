package com.weshopify.feature.users;

public class DataAccessFactory {
	public static ICustomerDataAccess GetCustomerDataAccessObj() {
		return new CustomerDataAccess();
	}
}