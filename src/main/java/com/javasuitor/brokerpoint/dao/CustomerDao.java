package com.javasuitor.brokerpoint.dao;

import java.util.List;

import com.javasuitor.brokerpoint.entity.Customer;

public interface CustomerDao {
	
	public Customer get(Integer customerId);
	public Customer save(Customer customer);
	public Customer update(Integer customerId , Customer customer);
	public Integer delete(Integer customerId);	
	public List<Customer> getAllCustomers();
	

}
