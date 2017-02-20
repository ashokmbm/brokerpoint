package com.javasuitor.brokerpoint.dao;

import java.util.List;

import com.javasuitor.brokerpoint.entity.Customer;

public interface CustomerDao {
	
	public Customer get(Long customerId);
	public Customer save(Customer customer);
	public Customer update(Long customerId , Customer customer);
	public Long delete(Long customerId);	
	public List<Customer> getAllCustomers();

}
