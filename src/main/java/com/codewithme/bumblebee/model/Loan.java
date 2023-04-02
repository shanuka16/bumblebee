package com.codewithme.bumblebee.model;

import java.util.Date;

public class Loan {
	
	private int IdLoan;
	private int customerIdLoan;
	private double usedAmount;
	private double loanBalance;
	private double installmentOne;
	private double installmentTwo;
	private double installmentThree;
	private java.sql.Date startDate;
	private java.sql.Date endDate;
	
	public Loan(int IdLoan, int customerIdLoan, double usedAmount, double loanBalance, double installmentOne, double installmentTwo,
			double installmentThree, java.sql.Date startDate, java.sql.Date endDate) {
		super();
		this.IdLoan = IdLoan;
		this.customerIdLoan = customerIdLoan;
		this.usedAmount = usedAmount;
		this.loanBalance = loanBalance;
		this.installmentOne = installmentOne;
		this.installmentTwo = installmentTwo;
		this.installmentThree = installmentThree;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Loan() {}
	
	public int getIdLoan() {
		return IdLoan;
	}

	public void setIdLoan(int IdLoan) {
		this.IdLoan = IdLoan;
	}

	public int getCustomerIdLoan() {
		return customerIdLoan;
	}

	public void setCustomerIdLoan(int customerIdLoan) {
		this.customerIdLoan = customerIdLoan;
	}

	public double getUsedAmount() {
		return usedAmount;
	}

	public void setUsedAmount(double usedAmount) {
		this.usedAmount = usedAmount;
	}

	public double getLoanBalance() {
		return loanBalance;
	}

	public void setLoanBalance(double loanBalance) {
		this.loanBalance = loanBalance;
	}

	public double getInstallmentOne() {
		return installmentOne;
	}

	public void setInstallmentOne(double installmentOne) {
		this.installmentOne = installmentOne;
	}

	public double getInstallmentTwo() {
		return installmentTwo;
	}

	public void setInstallmentTwo(double installmentTwo) {
		this.installmentTwo = installmentTwo;
	}

	public double getInstallmentThree() {
		return installmentThree;
	}

	public void setInstallmentThree(double installmentThree) {
		this.installmentThree = installmentThree;
	}

	public java.sql.Date getStartDate() {
		return startDate;
	}

	public void setStartDate(java.sql.Date startDate) {
		this.startDate = startDate;
	}

	public java.sql.Date getEndDate() {
		return endDate;
	}

	public void setEndDate(java.sql.Date endDate) {
		this.endDate = endDate;
	}
	
}
