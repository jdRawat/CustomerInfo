package com.calsoft.customer.info.repository;

import org.springframework.data.repository.CrudRepository;

import com.calsoft.customer.info.model.CustomerInfo;

public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, String>{

}
