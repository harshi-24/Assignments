package com.rest.webservices.restfulwebservices.demo;

public class Customer {
 private Integer CustomerId;
 private String Name;
 private String Address;
 private String  Number;
public Customer(Integer customerId, String name, String address,String  number) {
	super();
	CustomerId = customerId;
	Name = name;
	Address = address;
	Number = number;
}
public Integer getCustomerId() {
	return CustomerId;
}
public void setCustomerId(Integer customerId) {
	CustomerId = customerId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String  getNumber() {
	return Number;
}
public void setNumber(String  number) {
	Number = number;
}
@Override
public String toString() {
	return "Customer [CustomerId=" + CustomerId + ", Name=" + Name + ", Address=" + Address + ", Number=" + Number
			+ "]";
}


}
