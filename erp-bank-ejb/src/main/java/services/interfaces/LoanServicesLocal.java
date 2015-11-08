package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.Loan;

@Local
public interface LoanServicesLocal {
Boolean addloan(Loan loan);
	
	Boolean deleteloanById(Integer id);

	Loan findloanById(Integer id);

	Boolean updateloan(Loan loan);

	Boolean deleteloan(Loan loan);

	List<Loan> findAllLoan();
}
