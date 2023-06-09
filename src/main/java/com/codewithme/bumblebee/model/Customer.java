package com.codewithme.bumblebee.model;

import java.time.LocalDate;
import java.util.Date;

public class Customer {

	private int customerId;
	private String customerName;
	private java.sql.Date dob;
	private int customerContact;
	private String custMail;
	private String custUserName;
	private String custPassword;
	private boolean loanStatus;
	
	public Customer(int customerId, String customerName, java.sql.Date dob, int customerContact, String custMail,
			String custUserName, String custPassword, boolean loanStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dob = dob;
		this.customerContact = customerContact;
		this.custMail = custMail;
		this.custUserName = custUserName;
		this.custPassword = custPassword;
		this.loanStatus = loanStatus;
	}

	public Customer() {}
	
	public Customer( String customerName, java.sql.Date dob, int customerContact, String custMail,
			String custUserName, String custPassword, boolean loanStatus) {
		super();
		this.customerName = customerName;
		this.dob = dob;
		this.customerContact = customerContact;
		this.custMail = custMail;
		this.custUserName = custUserName;
		this.custPassword = custPassword;
		this.loanStatus = loanStatus;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustMail() {
		return custMail;
	}

	public void setCustMail(String custMail) {
		this.custMail = custMail;
	}

	public String getCustUserName() {
		return custUserName;
	}

	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	public boolean isLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	
}
