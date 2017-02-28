package com.javasuitor.brokerpoint.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ADDRESS_ID") 
	 private Integer addressId;
	
	@Column(name ="SHOPE_NUMBER") 
	 private String shopeNumber;  
	 
	@Column(name ="STREET")
	 private String street;
	 
	 @Column(name ="MARKET")
	 private String market;
	 
	 @Column(name ="CITY")
	 private String city; 
	  
	 @Column(name ="DISTRICT")
	 private String district;
	 
	 @Column(name ="STATE")
	 private String state;
	
	 @Column(name ="PINCODE")
	 private String pincode;

	public Address() {
		// default constructor
	}
	
	public Address(Integer addressId, String shopeNumber, String street, String market, String city, String district,
			String state, String pincode) {
		super();
		this.addressId = addressId;
		this.shopeNumber = shopeNumber;
		this.street = street;
		this.market = market;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getShopeNumber() {
		return shopeNumber;
	}

	public void setShopeNumber(String shopeNumber) {
		this.shopeNumber = shopeNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
     
	 
}
