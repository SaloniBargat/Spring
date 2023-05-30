package com.rest.webservice.restfulwebservices.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDaoService service;
	
	public UserResource(UserDaoService service) {
		this.service = service;
	}
	
	//Get
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	
	//GET
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable Long id){
		return service.findOne(id);
		
		//return service.findAll();
	}
	
	//Post
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		service.save(user);
		
		return ResponseEntity.created(null).build();
	}

}
