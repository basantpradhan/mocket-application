package com.clone;

public class Address implements Cloneable  {

	private String street;
	private String city;
	private String state;
	private String country;
	
	public Address(){
		
		country = "india";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		/*Address address = new Address();
		
		address.setCity(city);
		address.setStreet(street);
		address.setState(state);
		address.setCountry(country);
		
		return address;*/
		
		
		return super.clone();
	}
}
