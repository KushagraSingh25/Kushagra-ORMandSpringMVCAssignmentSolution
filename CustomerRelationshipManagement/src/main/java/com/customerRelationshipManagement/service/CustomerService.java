package com.customerRelationshipManagement.service;

import java.util.List;

import com.customerRelationshipManagement.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);

}
