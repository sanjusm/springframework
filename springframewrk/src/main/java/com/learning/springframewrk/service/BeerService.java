package com.learning.springframewrk.service;

import java.util.UUID;

import com.learning.springframewrk.web.model.BeerDTO;

public interface BeerService {

	BeerDTO getBeerById(UUID beerId);

}
