package com.sanjay.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.mongo.model.Address;
import com.sanjay.mongo.model.User;
import com.sanjay.mongo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/save")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<User>> getAllUserDetails(){
		return new ResponseEntity<List<User>>(userService.getAllUser(),HttpStatus.OK);
	}
	
	@PostMapping("/saveaddress")
	public ResponseEntity<Address> addAddress(@RequestBody Address address){
		return new ResponseEntity<Address>(userService.saveAddress(address),HttpStatus.OK);
	}

}
