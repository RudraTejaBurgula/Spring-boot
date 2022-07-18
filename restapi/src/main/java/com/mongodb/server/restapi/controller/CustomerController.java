package com.mongodb.server.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.server.restapi.model.CustomerModel;
import com.mongodb.server.restapi.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository crepo;
	@PostMapping("/addcustomer")
	public CustomerModel saveRecord(@RequestBody CustomerModel model) {
		
		return crepo.save(model);
	}
	@GetMapping("/getallcustomer")
	public List<CustomerModel> getAll(){
		return crepo.findAll();
	}
}
