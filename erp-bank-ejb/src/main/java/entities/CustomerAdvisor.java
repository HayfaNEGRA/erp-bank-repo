package entities;

import entities.Employee;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CustomerAdvisor
 *
 */
@Entity
@Table(name="T_CustomerAdvisor")

public class CustomerAdvisor extends Employee implements Serializable {

	
	private String role;
	private static final long serialVersionUID = 1L;

	public CustomerAdvisor() {
		super();
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
   
}
