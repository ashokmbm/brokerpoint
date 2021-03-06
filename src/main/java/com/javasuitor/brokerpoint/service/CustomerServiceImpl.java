package com.javasuitor.brokerpoint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasuitor.brokerpoint.dao.CustomerDao;
import com.javasuitor.brokerpoint.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	public Customer get(Integer customerId) {
				return customerDao.get(customerId);
	}

	public Customer save(Customer customer) {
		// TODO Auto-generated method stub		
		return customerDao.save(customer);
	}

	public Customer update(Integer customerId, Customer customer) {
		// TODO Auto-generated method stub		
		return customerDao.update(customerId, customer);
	}

	public Integer delete(Integer customerId) {
		// TODO Auto-generated method stub		
		return customerDao.delete(customerId);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub		
		return customerDao.getAllCustomers();
	}

	
	
}
