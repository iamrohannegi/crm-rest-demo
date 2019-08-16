package com.rohan.demo.service;

import java.util.List;

import com.rohan.demo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int id);
	
	public void saveCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
}
