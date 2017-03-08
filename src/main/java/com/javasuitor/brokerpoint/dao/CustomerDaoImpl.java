package com.javasuitor.brokerpoint.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javasuitor.brokerpoint.entity.Customer;

@Transactional
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public Customer get(Integer customerId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Customer.class, customerId);

	}

	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		Integer id = (Integer) hibernateTemplate.save(customer);
		return get(id);
	}

	public Customer update(Integer customerId, Customer customer) {
		Customer existingCustomer = get(customerId);
		return customer;
	}

	public Integer delete(Integer customerId) {
		Customer c = get(customerId);
		if (c != null) {
			hibernateTemplate.delete(c);
			return c.getCustomerId();
		}
		return -1;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		String hql = "From Customer order by customerId";

		@SuppressWarnings("unchecked")
		List<Customer> customerList = (List<Customer>) hibernateTemplate.find(hql);
		return customerList;

	}

}
