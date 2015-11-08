package services.imp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.ItManager;
import services.interfaces.ItManagerServicesLocal;
import services.interfaces.ItManagerServicesRemote;

/**
 * Session Bean implementation class ItManagerServices
 */
@Stateless
@LocalBean
public class ItManagerServices implements ItManagerServicesRemote, ItManagerServicesLocal {


	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public ItManagerServices() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public Boolean additmanager(ItManager itmanager) {
		Boolean b = false;
				try {
					entityManager.persist(itmanager);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteitmanagerById(Integer id) {
		Boolean b = false;
				try {
					entityManager.remove(finditmanagerById(id));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public ItManager finditmanagerById(Integer id) {
		return entityManager.find(ItManager.class, id);
		
	}

	@Override
	public Boolean updateitmanager(ItManager itmanager) {
		
		Boolean b = false;
				try {
					entityManager.merge(itmanager);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteitmanager(ItManager itmanager) {
		Boolean b = false;
				try {
					entityManager.remove(entityManager.merge(itmanager));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItManager> findAllItManager() {
		String jpql = "select e from ItManager e";
				Query query = entityManager.createQuery(jpql);
				return query.getResultList();
	}

}
