package com.microservice.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.currencyexchangeservice.Repository.CurrencyExchangeRepository;
import com.microservice.currencyexchangeservice.bean.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;
	@Autowired
	private CurrencyExchangeRepository repo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchange(@PathVariable String from,@PathVariable String to) {
		CurrencyExchange currencyExchange =  new CurrencyExchange(100L,from,to,BigDecimal.valueOf(50));
		String port = env.getProperty("local.server.port");
		repo.save(currencyExchange);
		currencyExchange.setEnvironment(port);
		return currencyExchange;
		
	}
	
}
