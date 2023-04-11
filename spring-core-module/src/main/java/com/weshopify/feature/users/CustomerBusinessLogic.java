package com.weshopify.feature.users;

public class CustomerBusinessLogic {
	ICustomerDataAccess _custDataAccess;
	
	public CustomerBusinessLogic(ICustomerDataAccess _custDataAccess) {
		this._custDataAccess = _custDataAccess;
	}

	

	public String GetCustomerName(int id) {
		return _custDataAccess.GetCustomerName(id);
	}
}