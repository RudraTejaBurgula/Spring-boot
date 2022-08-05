package com.microservice.currencyexchangeservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.currencyexchangeservice.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends MongoRepository<CurrencyExchange, Long> {

}
