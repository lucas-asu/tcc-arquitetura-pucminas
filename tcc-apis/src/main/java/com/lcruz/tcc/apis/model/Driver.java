package com.lcruz.tcc.apis.model;

import org.springframework.data.annotation.Id;

public class Driver {

	@Id
	private String id;
	private String name;
	private String driversLicense;
	private String photoUrl;
}
