package com.javasuitor.brokerpoint.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Customer_Id")
		
	private Integer customerId;
	
	
	@Column(name ="Customer_Name")
	
	private String name;
	
	@Column(name ="Customer_Tin")
	
	private String customerTin;
	
	@Column(name ="Customer_Contacts")
	
	private String contacts;
	
	@OneToOne
    @JoinColumn(name="Address_Id")
	private Address address;
	
	public Customer(){	}


	public Customer(String name, String customerTin, String contacts,Address address) {
		super();
		this.name = name;
		this.customerTin = customerTin;
		this.contacts = contacts;
		this.address = address;
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
		
}
