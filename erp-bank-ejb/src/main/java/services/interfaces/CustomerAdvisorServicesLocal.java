package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.CustomerAdvisor;

@Local
public interface CustomerAdvisorServicesLocal {
Boolean addcustomerAdvisor(CustomerAdvisor customerAdvisor);
	
	Boolean deletecustomerAdvisorById(Integer id);

	CustomerAdvisor findcustomerAdvisorById(Integer id);

	Boolean updatecustomerAdvisor(CustomerAdvisor customerAdvisor);

	Boolean deletecustomerAdvisor(CustomerAdvisor customerAdvisor);

	List<CustomerAdvisor> findAllCustomerAdvisor();

}
