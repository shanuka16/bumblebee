package com.codewithme.bumblebee.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.dao.CustomerManager;
import com.codewithme.bumblebee.model.Customer;

public class CustomerService {
	
	private static CustomerService customerServiceObject;
	private CustomerService() {}
	
	public static synchronized CustomerService getCustomerService() {
		if(customerServiceObject == null) {
			customerServiceObject = new CustomerService();
		}		
		return customerServiceObject;
	}
	private CustomerManager getCustomerManager(){
		return new CustomerManager();
	}	

	public boolean registerCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		return getCustomerManager().addCustomer(customer);
	}
	
	public Customer getSpecificCustomer(int customerId) throws ClassNotFoundException, SQLException {
		return getCustomerManager().getSpecificCustomer(customerId);
	}
	
	public List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException{
		return getCustomerManager().getAllCustomers();
	}
	public boolean editTheCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		return getCustomerManager().updateCustomer(customer);
	}
	public boolean deleteTheCustomer(int customerId) throws ClassNotFoundException, SQLException {
		return getCustomerManager().deleteCustomer(customerId);
	}
}
