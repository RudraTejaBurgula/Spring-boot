package com.mongodb.server.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.server.restapi.model.CustomerModel;

public interface CustomerRepository extends MongoRepository<CustomerModel, String>{

}
