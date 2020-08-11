package com.learning.springframewrk.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.learning.springframewrk.web.model.BeerDTO;

@Service
public class BeerServieImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {

		return BeerDTO.builder().id(UUID.randomUUID()).beerName("Corona").beerStyle("Lockdown").build();
	}

}
