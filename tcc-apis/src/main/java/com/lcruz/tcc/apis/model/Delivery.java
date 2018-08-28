package com.lcruz.tcc.apis.model;

import org.springframework.data.annotation.Id;

public class Delivery {
	
	@Id
	private String id;
	private String status;
	private String from;
	private String to;
	private Product product;
	private Client client;
	private String driverId;

}
