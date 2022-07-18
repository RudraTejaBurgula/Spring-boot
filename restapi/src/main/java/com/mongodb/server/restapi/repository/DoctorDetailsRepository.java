package com.mongodb.server.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.server.restapi.model.DoctorDetailsModel;

public interface DoctorDetailsRepository extends MongoRepository<DoctorDetailsModel, Integer>{

}
