package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		//.run method will return a ConfigurableApplicationContext object
		ConfigurableApplicationContext context =SpringApplication.run(FirstProjectApplication.class, args);
		//present we are manually creating the object
		//Alien a = new Alien();
		// getBean will get the object of Alien class
		Alien a = context.getBean(Alien.class);
		// to set weather the object of Alien is working or not create a method in Alien and access it
		//with the created object a
		a.show();
//		Alien a1 = context.getBean(Alien.class);
//		a1.show();
		//without adding component Annotation we won't get the method we are adding spring Bean of Alien
		//class if we won't create it won't treat it as a bean instance object
		
	}

}
