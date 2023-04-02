package com.codewithme.bumblebee.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codewithme.bumblebee.dao.LoanManager;
import com.codewithme.bumblebee.model.Loan;

public class LoanService {
	
	private static LoanService loanServiceObject;
	private LoanService() {}
	
	public static synchronized LoanService getLoanService() {
		if(loanServiceObject == null) {
			loanServiceObject = new LoanService();
		}		
		return loanServiceObject;
	}
	private LoanManager getLoanManager(){
		return new LoanManager();
	}

	public boolean registerLoan(Loan loan) throws ClassNotFoundException, SQLException {
		return false;
	}	
	public Loan getSpecificLoan(int IdLoan) throws ClassNotFoundException, SQLException {
		return getLoanManager().getSpecificLoan(IdLoan);
	}	
	public List<Loan> getAllLoan() throws ClassNotFoundException, SQLException{
		return new ArrayList<Loan>();
	}
	public boolean editTheLoan(Loan loan) throws ClassNotFoundException, SQLException {
		return false;
	}
	public boolean deleteTheLoan(int IdLoan) throws ClassNotFoundException, SQLException {
		return false;
	}
}
