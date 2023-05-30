 package com.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Emp {
	
	
	@Autowired
	@Qualifier("Home")
	private Address Homeaddress;
	@Autowired
	@Qualifier("Office")
	private Address Officeaddress;
	public Address getHomeaddress() {
		return Homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		Homeaddress = homeaddress;
	}
	public Address getOfficeaddress() {
		return Officeaddress;
	}
	public void setOfficeaddress(Address officeaddress) {
		Officeaddress = officeaddress;
	}
	public Emp(Address homeaddress, Address officeaddress) {
		super();
		Homeaddress = homeaddress;
		Officeaddress = officeaddress;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [Homeaddress=" + Homeaddress + ", Officeaddress=" + Officeaddress + "]";
	}
}