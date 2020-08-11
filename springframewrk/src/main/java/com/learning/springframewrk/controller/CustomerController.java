package com.learning.springframewrk.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springframewrk.service.CustomerService;
import com.learning.springframewrk.web.model.CustomerDTO;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId) {
		return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
	}
}
