package com.learner.webapp.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	@GetMapping("/v1/person")
	public PersonV1 personv1() {
		
		return new PersonV1("bob charlie");
	}
	@GetMapping("/v2/person")
	public PersonV2 personv2() {
		
		return new PersonV2(new Name("bob","charlie"));
	}
	//using params
	
	@GetMapping(value="/person/params",params = "version=1")
	public PersonV1 paramsv1() {
		
		return new PersonV1("bob charlie");
	}
	@GetMapping(value="/person/params",params = "version=2")
	public PersonV2 paramsv2() {
		
		return new PersonV2(new Name("bob","charlie"));
	}
	//using header
	
	@GetMapping(value="/person/header",headers =  "X-API-VERSION=1")
	public PersonV1 headerv1() {
		
		return new PersonV1("bob charlie");
	}
	@GetMapping(value="/person/header",headers =  "X-API-VERSION=2")
	public PersonV2 headerv2() {
		
		return new PersonV2(new Name("bob","charlie"));
	}
}
