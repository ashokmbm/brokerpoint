package com.javasuitor.brokerpoint.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javasuitor.brokerpoint.entity.Customer;
import com.javasuitor.brokerpoint.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	
	
	
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
	
	
	@GetMapping("/customers/{id}")
	public ResponseEntity getCustomer(@PathVariable ("id") Integer customerId){		
		
		Customer customer = customerService.get(customerId);
		
		if (customer == null) {
			return new ResponseEntity("No Customer found for ID " + customerId, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity(customer, HttpStatus.OK);
	}
	
	@PostMapping("/customers")
	public ResponseEntity saveCustomer(@RequestBody Customer customer ){
		return new ResponseEntity(customerService.save(customer),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity deleteCustomer(@PathVariable ("id") Integer customerId){
		
		if(null == customerService.delete(customerId)){
			new ResponseEntity("No customer exist with id"+customerId , HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity(customerId, HttpStatus.OK);
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity updateCustomer(@PathVariable Integer customerId, @RequestBody Customer customer){
	
		customer = customerService.update(customerId, customer);
		
		if(null == customerService.update(customerId, customer)){
			new ResponseEntity("No customer exist with id"+customerId , HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity(customer,HttpStatus.OK);
	}
	
}
