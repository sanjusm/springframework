package com.learning.springframewrk.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.learning.springframewrk.web.model.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomerById(UUID customerId) {

		return CustomerDTO.builder().id(UUID.randomUUID()).customerName("Sanjay").build();
	}

}
