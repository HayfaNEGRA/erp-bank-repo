package services.imp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Loan;
import services.interfaces.LoanServicesLocal;
import services.interfaces.LoanServicesRemote;

/**
 * Session Bean implementation class LoanServices
 */
@Stateless
@LocalBean
public class LoanServices implements LoanServicesRemote, LoanServicesLocal {

 
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public LoanServices() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public Boolean addloan(Loan loan) {
		Boolean b = false;
				try {
					entityManager.persist(loan);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteloanById(Integer id) {
		Boolean b = false;
				try {
					entityManager.remove(findloanById(id));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Loan findloanById(Integer id) {
		return entityManager.find(Loan.class, id);
		
	}

	@Override
	public Boolean updateloan(Loan loan) {
		
		Boolean b = false;
				try {
					entityManager.merge(loan);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteloan(Loan loan) {
		Boolean b = false;
				try {
					entityManager.remove(entityManager.merge(loan));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Loan> findAllLoan() {
		String jpql = "select e from Loan e";
				Query query = entityManager.createQuery(jpql);
				return query.getResultList();
	}

}
