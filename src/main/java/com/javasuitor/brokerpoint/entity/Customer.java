package com.javasuitor.brokerpoint.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="customerId")	
	private Integer customerId;
	
	@Column(name ="fname")
	private String fname;
	@Column(name ="lname")
	private String lname;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="contact")
	private String contact;
	
	
	public Customer(){	}
		
	public Customer(Integer id, String fname, String lname, String email, String contact) {
		super();
		this.customerId = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
	}
    
	public Integer getCustomerId() {
		return customerId;
	}
	
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
		
	
}
