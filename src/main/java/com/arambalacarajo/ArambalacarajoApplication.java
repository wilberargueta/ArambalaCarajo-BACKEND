package com.arambalacarajo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ArambalacarajoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ArambalacarajoApplication.class, args);
	}
	   @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }

	    private static Class<ArambalacarajoApplication> applicationClass = ArambalacarajoApplication.class;
	

}
