package com.mongodb.server.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.server.restapi.model.AdminLoginModel;

public interface AdminLoginRepository extends MongoRepository<AdminLoginModel, String> {

}
