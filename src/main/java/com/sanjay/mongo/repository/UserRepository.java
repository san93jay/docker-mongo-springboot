package com.sanjay.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sanjay.mongo.model.User;

public interface UserRepository extends MongoRepository<User, Integer>{


}
