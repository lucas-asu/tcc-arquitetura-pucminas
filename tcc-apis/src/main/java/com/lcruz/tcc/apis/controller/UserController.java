package com.lcruz.tcc.apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcruz.tcc.apis.model.User;
import com.lcruz.tcc.apis.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository repository;
	
	@RequestMapping(path = "/apis/v1/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> findAll() {
		return repository.findAll();
	}
	
	@RequestMapping(path = "/api/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<String> save(@RequestBody User user) {
		return new ResponseEntity<String>("Em desenvolvimento", HttpStatus.EXPECTATION_FAILED);
	}
}
