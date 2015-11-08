package services.imp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.CreditCard;
import services.interfaces.CreditCardServicesLocal;
import services.interfaces.CreditCardServicesRemote;

/**
 * Session Bean implementation class CreditCardServices
 */
@Stateless
@LocalBean
public class CreditCardServices implements CreditCardServicesRemote, CreditCardServicesLocal {


	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public CreditCardServices() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public Boolean addcreditCard(CreditCard creditCard) {
		Boolean b = false;
				try {
					entityManager.persist(creditCard);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deletecreditCardById(Integer id) {
		Boolean b = false;
				try {
					entityManager.remove(findcreditCardById(id));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public CreditCard findcreditCardById(Integer id) {
		return entityManager.find(CreditCard.class, id);
		
	}

	@Override
	public Boolean updatecreditCard(CreditCard creditCard) {
		
		Boolean b = false;
				try {
					entityManager.merge(creditCard);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deletecreditCard(CreditCard creditCard) {
		Boolean b = false;
				try {
					entityManager.remove(entityManager.merge(creditCard));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CreditCard> findAllCreditCard() {
		String jpql = "select e from CreditCard e";
				Query query = entityManager.createQuery(jpql);
				return query.getResultList();
	}

}
