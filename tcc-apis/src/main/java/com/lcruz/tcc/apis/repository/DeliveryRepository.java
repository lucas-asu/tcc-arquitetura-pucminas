package com.lcruz.tcc.apis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcruz.tcc.apis.model.Delivery;

public interface DeliveryRepository extends MongoRepository<Delivery, String>{

}
