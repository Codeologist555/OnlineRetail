package com.cts.service;

import com.cts.bean.Customer;
import com.cts.dao.CustomerDao;

public class CustomerService {
	private CustomerDao dao;
	public boolean addCustomer(Customer customer) {
		dao = new CustomerDao();
		return dao.addCustomer(customer);
	}
}