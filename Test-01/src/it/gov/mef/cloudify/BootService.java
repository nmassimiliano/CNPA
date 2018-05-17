package it.gov.mef.cloudify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootService extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(BootService.class, args);
	}
}
