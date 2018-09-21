package com.stackroute.Location.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Location {
	
	private String City;
	private String State; 
	private String Country;
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
	public Location(String city, String state, String country) {
		super();
		City = city;
		State = state;
		Country = country;
	}
	public Location() {
		super();
	}
	
	

	
	
}
