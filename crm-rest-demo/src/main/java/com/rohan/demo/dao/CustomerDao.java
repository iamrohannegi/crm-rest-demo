package com.rohan.demo.dao;

import java.util.List;

import com.rohan.demo.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int id);
	
	public void saveCustomer(Customer customer);
	
	public void deleteCustomer(int id);
}
