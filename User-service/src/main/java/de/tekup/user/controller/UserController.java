package de.tekup.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private Environment env;
	
	@GetMapping
	public String works() {
		return "User MS works on port :"+ env.getProperty("local.server.port");
	}

}
