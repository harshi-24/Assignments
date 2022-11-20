package com.rest.webservices.restfulwebservices.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Zipcode {
	@JsonIgnore
	private Integer zipcode;
	private String City;
	private String State;
	private String Country;
	public Zipcode(Integer zipcode, String city, String state, String country) {
		super();
		this.zipcode = zipcode;
		City = city;
		State = state;
		Country = country;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
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
	@Override
	public String toString() {
		return "Zipcode [zipcode=" + zipcode + ", City=" + City + ", State=" + State + ", Country=" + Country + "]";
	}

	

}
