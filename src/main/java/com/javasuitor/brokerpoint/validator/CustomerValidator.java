package com.javasuitor.brokerpoint.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javasuitor.brokerpoint.entity.Customer;

public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> className) {
		
		return Customer.class.equals(className);
		
	}

	@Override
	public void validate(Object target, Errors error) {
		// TODO Auto-generated method stub
		
		Customer customer = (Customer) target;
		ValidationUtils.rejectIfEmpty(error,"customerId","NotEmpty.customer.fname");
		ValidationUtils.rejectIfEmpty(error,"customerId","NotEmpty.customer.fname");
		ValidationUtils.rejectIfEmpty(error,"customerId","NotEmpty.customer.fname");
	}

	
}
