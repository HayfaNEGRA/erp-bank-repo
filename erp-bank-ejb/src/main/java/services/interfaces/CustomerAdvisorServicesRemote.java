package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import entities.CustomerAdvisor;

@Remote
public interface CustomerAdvisorServicesRemote {
Boolean addcustomerAdvisor(CustomerAdvisor customerAdvisor);
	
	Boolean deletecustomerAdvisorById(Integer id);

	CustomerAdvisor findcustomerAdvisorById(Integer id);

	Boolean updatecustomerAdvisor(CustomerAdvisor customerAdvisor);

	Boolean deletecustomerAdvisor(CustomerAdvisor customerAdvisor);

	List<CustomerAdvisor> findAllCustomerAdvisor();

}
