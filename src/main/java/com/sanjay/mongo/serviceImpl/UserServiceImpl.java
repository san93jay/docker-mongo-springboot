package com.sanjay.mongo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.mongo.model.Address;
import com.sanjay.mongo.model.User;
import com.sanjay.mongo.repository.AddressRepository;
import com.sanjay.mongo.repository.UserRepository;
import com.sanjay.mongo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public User saveUser(User user) {
		
		return userRepository.insert(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Address saveAddress(Address address) {
		
		return addressRepository.insert(address);
	}

}
