package com.javasuitor.brokerpoint.entity;



public class Customer {

	private Long customerId;
	private String fname;
	private String lname;
	private String email;
	private String contact;
	
	
	public Customer(){	}
		
	public Customer(Long id, String fname, String lname, String email, String contact) {
		super();
		this.customerId = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
	}
    
	public Long getCustomerId() {
		return customerId;
	}
	
	
	public void setCustomerId(Long customerId) {
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
