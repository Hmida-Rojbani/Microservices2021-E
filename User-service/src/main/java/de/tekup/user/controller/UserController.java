package de.tekup.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@GetMapping
	public String works() {
		return "User MS works";
	}

}
