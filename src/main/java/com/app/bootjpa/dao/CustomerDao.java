package com.app.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.bootjpa.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{
	

}
