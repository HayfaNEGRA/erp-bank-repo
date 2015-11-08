package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.Customer;

@Local
public interface CustomerServicesLocal {
    Boolean addCustomer(Customer customer);
	
	Boolean deleteCustomerById(Integer id);

	Customer findCustomerById(Integer id);

	Boolean updateCustomer(Customer customer);

	Boolean deleteCustomer(Customer customer);

	List<Customer> findAllCustomer();

}
