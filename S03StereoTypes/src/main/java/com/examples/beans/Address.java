package com.examples.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("HYD")
	private String city;
	@Value("Tg")
	private String state;
	@Value("500016")
	private String pincode;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}