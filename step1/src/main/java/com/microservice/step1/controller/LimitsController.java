package com.microservice.step1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.step1.bean.Configuration;
import com.microservice.step1.bean.Limits;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(2,15);
	}
	
	@GetMapping("/config1")
		public Limits retrieve() {
			return new Limits(configuration.getMinimum(),configuration.getMaximum());

		}
}
