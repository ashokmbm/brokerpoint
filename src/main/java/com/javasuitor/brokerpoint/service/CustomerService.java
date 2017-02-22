package com.javasuitor.brokerpoint.service;

import java.util.List;

import com.javasuitor.brokerpoint.entity.Customer;

public interface CustomerService {
	public Customer get(Integer customerId);
	public Customer save(Customer customer);
	public Customer update(Integer customerId , Customer customer);
	public Integer delete(Integer customerId);
	public List<Customer> getAllCustomers();
	

}
