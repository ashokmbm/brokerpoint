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

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




@Entity
@Table(name="CUSTOMER")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="CUSTOMER_ID")
	@NotEmpty	
	private Integer customerId;
	
	
	@Column(name ="CUSTOMER_NAME")
	@NotEmpty
	private String name;
	
	@Column(name ="CUSTOMER_TIN")
	@Email
	@NotEmpty
	private String custoamerTin;
	
	@Column(name ="CUSTOMER_CONTACTS")
	
	private String contacts;
	
	@OneToOne
    @JoinColumn(name="ADDRESS_ID")
	private Address address;
	
	public Customer(){	}


	public Customer(String name, String custoamerTin, String contacts,Address address) {
		super();
		this.name = name;
		this.custoamerTin = custoamerTin;
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


	public String getCustoamerTin() {
		return custoamerTin;
	}


	public void setCustoamerTin(String custoamerTin) {
		this.custoamerTin = custoamerTin;
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
