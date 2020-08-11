package com.learning.springframewrk.service;

import java.util.UUID;

import com.learning.springframewrk.web.model.CustomerDTO;

public interface CustomerService {

	CustomerDTO getCustomerById(UUID customerId);
}
