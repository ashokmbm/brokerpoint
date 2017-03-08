package com.javasuitor.brokerpoint.entity;

import javax.persistence.Column;

public class CustomerPojo {

	private Integer customerId;	
	private String name;	
	private String customerTin;
	private String contacts;
	
	public CustomerPojo() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerTin() {
		return customerTin;
	}

	public void setCustomerTin(String customerTin) {
		this.customerTin = customerTin;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	
	


}
