package services.imp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.CustomerAdvisor;
import services.interfaces.CustomerAdvisorServicesLocal;
import services.interfaces.CustomerAdvisorServicesRemote;

/**
 * Session Bean implementation class CustomerAdvisorServices
 */
@Stateless
@LocalBean
public class CustomerAdvisorServices implements CustomerAdvisorServicesRemote, CustomerAdvisorServicesLocal {

    @PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public CustomerAdvisorServices() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public Boolean addcustomerAdvisor(CustomerAdvisor customerAdvisor) {
		Boolean b = false;
				try {
					entityManager.persist(customerAdvisor);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deletecustomerAdvisorById(Integer id) {
		Boolean b = false;
				try {
					entityManager.remove(findcustomerAdvisorById(id));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public CustomerAdvisor findcustomerAdvisorById(Integer id) {
		return entityManager.find(CustomerAdvisor.class, id);
		
	}

	@Override
	public Boolean updatecustomerAdvisor(CustomerAdvisor customerAdvisor) {
		
		Boolean b = false;
				try {
					entityManager.merge(customerAdvisor);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deletecustomerAdvisor(CustomerAdvisor customerAdvisor) {
		Boolean b = false;
				try {
					entityManager.remove(entityManager.merge(customerAdvisor));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerAdvisor> findAllCustomerAdvisor() {
		String jpql = "select e from CustomerAdvisor e";
				Query query = entityManager.createQuery(jpql);
				return query.getResultList();
	}
}
