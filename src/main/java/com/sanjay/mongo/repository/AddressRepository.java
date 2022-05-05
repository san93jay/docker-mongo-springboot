package com.sanjay.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sanjay.mongo.model.Address;

public interface AddressRepository extends MongoRepository<Address,Integer> {

}
