package com.mongodb.server.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.server.restapi.model.AdminLoginModel;
import com.mongodb.server.restapi.repository.AdminLoginRepository;

@RestController
public class AdminLoginController {
	@Autowired
	private AdminLoginRepository arepo;
	@GetMapping("/adminlogin")
	public List<AdminLoginModel> getAll(){
		return arepo.findAll();
		
	}
}
