package com.javasuitor.brokerpoint.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javasuitor.brokerpoint.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	private static List<Customer> customersList;
	{
		customersList = new ArrayList<Customer>();
		customersList.add(new Customer(Long.parseLong("1001"), "Ashok", "Singh", "ashok@gmail.com", "9680406818"));
		customersList.add(new Customer(Long.parseLong("1002"), "Devang", "Tadel", "devang@gmail.com", "9680406818"));
		customersList.add(new Customer(Long.parseLong("1003"), "Vivek", "Khamar", "vivek@gmail.com", "9680406818"));
		customersList.add(new Customer(Long.parseLong("1004"), "Sourabh", "Dubey", "sourabh@gmail.com", "8979034343"));

	}

	public Customer get(Long customerId) {
		// TODO Auto-generated method stub
		for (Customer customer : customersList) {
			if (customer.getCustomerId().equals(customerId)) {
				return customer;
			}
		}
		return null;
	}

	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		for (Customer existingCustomer : customersList) {
			if (existingCustomer.getCustomerId() == customer.getCustomerId()) {
				System.out.println("Customer Already Exist");
				return null;
			}
		}
		customersList.add(customer);
		return customer;
	}

	public Customer update(Long customerId, Customer customer) {

		for (Customer existingCustomer : customersList) {
			if (existingCustomer.getCustomerId() == customer.getCustomerId()) {
				customersList.add(customer);
				return customer;
			}
		}
		return null;
	}

	public Long delete(Long customerId) {
		for (Customer existingCustomer : customersList) {
			if (existingCustomer.getCustomerId() == customerId) {
				customersList.remove(existingCustomer);
				return existingCustomer.getCustomerId();
			}
		}
		
		return null;
	}

	
 public List<Customer> getAllCustomers() {
	// TODO Auto-generated method stub
	return customersList;
}
	
}
