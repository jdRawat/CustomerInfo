package com.calsoft.customer.info.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerInfo {

	@Id
	private String customerId;
	private String name;
	private int age;
	private String address;
	private long contact;

	public CustomerInfo() {

	}

	public CustomerInfo(String customerId, String name, int age, String address, long contact) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.contact = contact;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
}
