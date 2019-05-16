package com.cts.dao;

import com.cts.bean.Customer;

public class CustomerDao {
	
	public boolean addCustomer(Customer customer) {
		System.out.println(customer.getcId()+" "+customer.getcName());
		return true;
	}
}
