package com.javasuitor.brokerpoint.service;

import java.util.List;

import com.javasuitor.brokerpoint.entity.Customer;

public interface CustomerService {
	
	public Customer get(Long customerId);
	public Customer save(Customer customer);
	public Customer update(Long customerId , Customer customer);
	public Long delete(Long customerId);
	public List<Customer> getAllCustomers();

}
