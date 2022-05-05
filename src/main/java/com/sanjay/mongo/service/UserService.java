package com.sanjay.mongo.service;

import java.util.List;

import com.sanjay.mongo.model.Address;
import com.sanjay.mongo.model.User;

public interface UserService {
	User saveUser(User user);

	List<User> getAllUser();

	Address saveAddress(Address address);

}
