package services.imp;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Employee;
import services.interfaces.EmployeeServicesLocal;
import services.interfaces.EmployeeServicesRemote;

/**
 * Session Bean implementation class EmployeeServices
 */
@Stateless
@LocalBean
public class EmployeeServices implements EmployeeServicesRemote, EmployeeServicesLocal {

	@PersistenceContext(name = "gestionemploye")
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public EmployeeServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEmployee(Employee employee) {
		Boolean b = false;
				try {
					entityManager.persist(employee);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteEmployeeById(Integer id) {
		Boolean b = false;
				try {
					entityManager.remove(findEmployeeById(id));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return entityManager.find(Employee.class, id);
		
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		
		Boolean b = false;
				try {
					entityManager.merge(employee);
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public Boolean deleteEmployee(Employee employee) {
		Boolean b = false;
				try {
					entityManager.remove(entityManager.merge(employee));
					b = true;
				} catch (Exception e) {
					System.err.println("ouups ...");
				}
				return b;
	}

	@Override
	public List<Employee> findAllEmployee() {
			Query query = entityManager.createQuery("select a from Employee a");
			return query.getResultList();

		

	}
	

}
