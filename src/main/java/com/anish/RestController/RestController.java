package com.anish.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anish.Entity.User;
import com.anish.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String hello() {
		return "welcome to spring-dasdb";
	}
	
	
	@GetMapping("/saveuser")
	public   String save(@RequestParam String username , @RequestParam String  firstname , @RequestParam String  lastname, @RequestParam int age,@RequestParam String password) {
		User user = new User(username,firstname,lastname,age,password);
		userService.saveMyUser(user);
		return "user saved";
	}
	
	
}
