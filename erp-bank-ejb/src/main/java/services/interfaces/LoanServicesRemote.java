package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.Loan;

@Remote
public interface LoanServicesRemote {
Boolean addloan(Loan loan);
	
	Boolean deleteloanById(Integer id);

	Loan findloanById(Integer id);

	Boolean updateloan(Loan loan);

	Boolean deleteloan(Loan loan);

	List<Loan> findAllLoan();

}
