package com.lcruz.tcc.apis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcruz.tcc.apis.model.Driver;

public interface DriverRepository extends MongoRepository<Driver, String>{

}
