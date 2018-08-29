package com.lcruz.tcc.apis.model;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String tokenPush;
	private String[] permissions;
	
	

}
