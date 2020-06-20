package com.calsoft.customer.info.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calsoft.customer.info.model.CustomerInfo;
import com.calsoft.customer.info.repository.CustomerInfoRepository;

@Service
public class CustomerInfoServices {

	@Autowired
	CustomerInfoRepository repository;

	public List<CustomerInfo> getAllCustomers() {
		List<CustomerInfo> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);
		return customers;
	}

	public CustomerInfo getCustomerInfoById(String customerId) {
		return repository.findById(customerId).get();
	}

	public String addCustomerInfo(CustomerInfo customerInfo) {
		repository.save(customerInfo);
		return "Customer Information added successfully!";
	}

	public String updateCustomerInfo(String customerId, CustomerInfo customerInfo) {
		repository.save(customerInfo);
		return "Customer information is updated successfully!";
	}

	public String deleteCustomerInfo(String customerId) {
		repository.deleteById(customerId);
		return "Customer info for givern customer ID is deleted successfully!";
	}
}
