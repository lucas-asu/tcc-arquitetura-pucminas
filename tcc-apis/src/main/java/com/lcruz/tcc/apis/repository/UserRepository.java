package com.lcruz.tcc.apis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcruz.tcc.apis.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
