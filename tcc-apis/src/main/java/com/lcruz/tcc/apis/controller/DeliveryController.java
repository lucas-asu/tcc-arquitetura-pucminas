package com.lcruz.tcc.apis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lcruz.tcc.apis.repository.DeliveryRepository;


@RestController
public class DeliveryController {
	
	@Autowired
	DeliveryRepository repository;

}
