package com.mongodb.server.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.server.restapi.model.DoctorDetailsModel;
import com.mongodb.server.restapi.repository.DoctorDetailsRepository;

@RestController
public class DoctorDetailsController {
	@Autowired
	private DoctorDetailsRepository drepo;
	// to write a query in Mongo need to import this package
	Query query = new Query();
	Update update = new Update();
	MongoOperations operation;
	
	
	@PostMapping("/setdoctor")
	public ResponseEntity<DoctorDetailsModel> addDetails(@RequestBody DoctorDetailsModel details) {
		try {
		return new ResponseEntity<>(drepo.save(details),HttpStatus.CREATED);
		}catch(Exception ex) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/getalldoctors")
	public ResponseEntity<List<DoctorDetailsModel>> getallDoctors(){
		try{
			return new ResponseEntity<>(drepo.findAll(),HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/editdetails/{id}")
	public ResponseEntity<DoctorDetailsModel> editDetails(@PathVariable("id") int id,@RequestBody DoctorDetailsModel details) {
		
		Optional<DoctorDetailsModel> data = drepo.findById(id);
		if(data.isPresent()) {
			DoctorDetailsModel detail = data.get();
			
			detail.setDoc_name(details.getDoc_name());
			detail.setDate(details.getDate());
			detail.setDoc_number(details.getDoc_number());
			detail.setHosp_location(details.getHosp_location());
			detail.setSpec_name(details.getSpec_name());
			detail.setHosp_name(details.getHosp_name());
			return new ResponseEntity<>(drepo.save(detail),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/deletedetails/{id}")
	public ResponseEntity<DoctorDetailsModel> delteDetails(@PathVariable("id") int id){
		try {
			drepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception ex){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
