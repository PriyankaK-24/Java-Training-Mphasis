package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

public class Employee {
	
	private int id;
	private String name;
	private String company;
	private List<Address> adr;
	
	@Autowired
	@Scope(scopeName = "singleton")
	public List<Address> getAdr() {
		return adr;
	}
	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}