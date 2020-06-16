package com.calsoft.customer.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calsoft.customer.info.model.CustomerInfo;
import com.calsoft.customer.info.service.CustomerInfoServices;

@RestController
public class CustomerInfoController {

	@Autowired
	private CustomerInfoServices services;
	@RequestMapping("/customers")
	public List<CustomerInfo> getAllCustomers(){
		return services.getAllCustomers();
	}
	@RequestMapping("/customers/{customerId}")
	public CustomerInfo getCustomerInfo(@PathVariable String customerId) {
		return services.getCustomerInfoById(customerId);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/customers")
	public String addCustomerInfo(@RequestBody CustomerInfo customerInfo) {
		return services.addCustomerInfo(customerInfo);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/customers/{customerId}")
	public String updateCustomerInfo(@RequestBody CustomerInfo customerInfo,@PathVariable String customerId) {
		return services.updateCustomerInfo(customerId, customerInfo);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/customers/{customerId}")
	public String deleteCustomerInfo(@PathVariable String customerId) {
		return services.deleteCustomerInfo(customerId);
	}
}
