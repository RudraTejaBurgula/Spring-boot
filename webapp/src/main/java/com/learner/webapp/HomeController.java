package com.learner.webapp;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.learner.webapp.Bean.Aliean;

@RestController
public class HomeController {
	@RequestMapping("home")
	public String home() {
		//the path we have is localhost:8080/home
		System.out.println("home");
		return "home called";
	}
	//aid; alang - exclude
	@GetMapping("/filterAll")
	public MappingJacksonValue retriveAll() {
		
		Aliean all = new Aliean(1,"name","lang");
		SimpleBeanPropertyFilter filter =SimpleBeanPropertyFilter.filterOutAllExcept("aid","alang");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBean",filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(all);
		mapping.setFilters(filters);
		return mapping;
		
	}

}
