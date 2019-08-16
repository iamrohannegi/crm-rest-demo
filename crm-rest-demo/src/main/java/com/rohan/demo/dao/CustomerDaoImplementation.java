package com.rohan.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohan.demo.entity.Customer;
import com.rohan.demo.rest.CustomerNotFoundException;

@Repository
public class CustomerDaoImplementation implements CustomerDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
		
		List<Customer> customers = query.getResultList();
		
		if(customers.isEmpty()) {
			throw new CustomerNotFoundException("No customers found.");
		}
		
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer customer = currentSession.get(Customer.class, id);

		if(customer == null) {
			throw new CustomerNotFoundException("Customer not found with id: " + id);
		}
		
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer customer = getCustomer(id);
		
		currentSession.remove(customer);
		
	}

}
