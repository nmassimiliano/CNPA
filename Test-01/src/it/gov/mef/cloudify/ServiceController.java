package it.gov.mef.cloudify;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@RequestMapping("/")
	public String hello() {
		return "L'inverno è arrivato";
	}
}
